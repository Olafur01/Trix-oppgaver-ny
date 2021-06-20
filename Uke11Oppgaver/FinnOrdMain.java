import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.io.File;
import java.io.FileNotFoundException;

public class FinnOrdMain {
    public static void main(String [] args) throws FileNotFoundException{
        String filnavn = args[0];
        String ordViSoeker = args[1];
        int antallTraader = Integer.parseInt(args[2]);

        Scanner fil = new Scanner(new File(filnavn));

        int antalllinjer = fil.nextInt();
    
        String[] ordList = new String[antalllinjer];

        int indeks = 0;
        while (fil.hasNextLine()){
            String ord = fil.nextLine().trim();
            ordList[indeks] = ord;
            indeks++;
        }

        // Hver traad trenger en referanse til CountDownLatch og en monitor
        CountDownLatch cdl = new CountDownLatch(antallTraader);
        OrdMonitor monitor = new OrdMonitor();
        int ordPaaHverTraad = antalllinjer / antallTraader;
        indeks = 0;

        // Deler opp listen med ord og oppretter Traadene 
        for (int i = 0; i < antallTraader; i++){

            // Hvor mange ord skal traaden lete etter
            int antallOrd;
            // Hvis det er den siste traaden, saa betyr det ikke automatisk at det er akkurat nok til denne
            if (i == antallTraader - 1){
                antallOrd = antalllinjer - indeks;
            }
            else{
                antallOrd = ordPaaHverTraad;
            }

            //Finner start og sluttindeksen for hver traad
            int startIndeks = indeks;
            int sluttIndeks = indeks + antallOrd;
            indeks = indeks + antallOrd;

            new Thread(new OrdTraad(ordList, startIndeks, sluttIndeks, ordViSoeker, monitor, cdl)).start();
        }

        // Etter at alle traadene har blitt opprettet, saa maa main traaden vente paa at disse skal bli ferdig 
        try{
            cdl.await();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Ordet " + ordViSoeker + " forekom " + monitor.hentAntall() + " ganger i filen");
    }
}
