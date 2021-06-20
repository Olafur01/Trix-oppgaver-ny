import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CDSamling {
    

    public static ArrayList<CDAlbum> lesInnFil(String input) throws FileNotFoundException {
        ArrayList<CDAlbum> cdSamling = new ArrayList<>();
        Scanner sc = new Scanner(new File(input));
        while (sc.hasNextLine()){
            String [] linje = sc.nextLine().split(",");
            CDAlbum cdAlbum = new CDAlbum(linje[0], linje[1], linje[2]);
            
            boolean sattInn = false;
            int teller = 0;

            while(!sattInn && teller < cdSamling.size()){
                if (cdSamling.get(teller).compareTo(cdAlbum) < 0){
                    cdSamling.add(teller, cdAlbum);
                    sattInn = true;
                }
                teller++;
            }
            if (!sattInn){
                cdSamling.add(cdAlbum);
            }
        }
    sc.close();
    return cdSamling;
    }

    public static void sortertAlbum(ArrayList<CDAlbum> cdSamling){
        Scanner sc = new Scanner(System.in);
        String linje = sc.nextLine();
        File nyFil = new File(linje + ".txt");

        try{
            PrintWriter pw = new PrintWriter(nyFil);
            for (CDAlbum cd: cdSamling){
                pw.append(cd.toString() + "\n");
            }
            pw.close();
        }
        catch (IOException e){
            System.out.println("An feil oppstod");
            e.printStackTrace();
        }
        System.out.println("Ferdig printet fil: " + linje + ".txt");
    }   

    
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<CDAlbum> nyCDSamling =  lesInnFil(args[0]);
        
        for (CDAlbum cd:nyCDSamling){
            System.out.println(cd);
        }

        
        System.out.println("Hva vil du kalle den nye filen?");
        sortertAlbum(nyCDSamling);
    }

}
