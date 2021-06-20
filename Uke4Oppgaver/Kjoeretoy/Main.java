package Kjoeretoy;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner leser = new Scanner(System.in);
        int input = -1;

        System.out.println("God Morgen. Hvilken type bil vil du opprette");
        while (input != 0){
            System.out.println("Hva vil du gjoere");
            System.out.println("Register en personbil: Skriv '1'");
            System.out.println("Register en buss: Skriv '2'");
            System.out.println("Register en varebil: Skriv '3'");
            try {
                input = leser.nextInt();
                if (input == 1)
                    System.out.println("Hva er navnet til sjaafoeren: ");
                    String navn = leser.nextLine();
                    System.out.println("Hva er navnet til registeringsnummeret: ");
                    String reg = leser.nextLine();
                    System.out.println("Hvilken type bil er det: ");
                    String modell = leser.nextLine();
                    System.out.println("Hvor mange plasser har bilen");
                    try{
                        int plasser = leser.nextInt();
                        Personbil bil = new Personbil(navn, modell, reg, plasser);
                        bil.skrivUt();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Du har inputtet feil verdi, forsoek igjen");
                    }
            }
            catch (InputMismatchException e) {
                System.out.println("Du har inputtet feil verdi, forsoek igjen");
            }
        }
    }
}
