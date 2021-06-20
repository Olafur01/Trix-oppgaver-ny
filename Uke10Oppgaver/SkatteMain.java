import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.io.File;


public class SkatteMain {
    public static void main(String[] args){
        Skattekart skattekart = null;

        try{
            File fil = new File(args[0]);
            skattekart = Skattekart.lesInn(fil);
        } catch (FileNotFoundException e){
            System.out.println("Fant ikke filen"); 
        }
        skattekart.skrivUt();
        Scanner brukerinput = new Scanner(System.in);

        System.out.println("\nFinn skatten! Gjett koordinater paa formatet (kol rad) (a for aa avslutte):");
        String inn = brukerinput.nextLine();

        int antallForsoek = 0;

        while(!inn.equals("a")){
            String [] l = inn.split(" ");
            try{
                int kol = Integer.parseInt(l[0]);
                int rad = Integer.parseInt(l[1]);

                if(skattekart.sjekk(rad, kol)){
                    System.out.println("Du fant skatten, HURRRA!!.");
                    break;
                }
                else{
                    antallForsoek++;
                    System.out.println("Skatten var ikke der. Proev paa nytt");

                    inn = brukerinput.nextLine();
                }
            skattekart.skrivUt();
            }
            catch(NumberFormatException e){
                System.out.println("Ugyldig input");
            }
        }

    }
}

