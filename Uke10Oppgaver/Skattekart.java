import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Skattekart {

    private int kolonne;
    private int rad;
    private char[][] skattekart;
    private boolean funnet = false;

    public Skattekart(int rad, int kolonne, char[][] kart){
        this.kolonne = kolonne;
        this.rad = rad;
        this.skattekart = kart;
    }

    static Skattekart lesInn(File f) throws FileNotFoundException{
        Scanner sc = new Scanner(f);
        String [] foersteLinje = sc.nextLine().split(" ");
        int antR = Integer.parseInt(foersteLinje[0]);
        int antK = Integer.parseInt(foersteLinje[1]);

        char[][] kart =  new char[antR][antK];

        for (int rad = 0; rad < antR; rad++){
            String linje = sc.nextLine();
            for (int kol = 0; kol < antK; kol++){
                kart[rad][kol] = linje.charAt(kol);
            }
        }
        sc.close();

        return new Skattekart(antR, antK, kart);
    }

    public void skrivUt() {
        for (int i = 0; i < skattekart.length; i++) {
            for (int j = 0; j < skattekart[i].length; j++) {
                if (funnet) {
                    System.out.print(skattekart[i][j]);
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public boolean sjekk(int rad, int kol){
        if (skattekart[kol][rad] == 'X'){
            funnet = true;
        }
        return funnet;
    }

}
