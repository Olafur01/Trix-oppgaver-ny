package Parkeringsplass;

public class Main {
   
    public static void main(String[] args){ 
        Parkeringsplass<Bil> parkeringbil = new Parkeringsplass<>();
        Parkeringsplass<Motorsykkel> parkeringMotorsykkel = new Parkeringsplass<>();
        Bil bilen = new Bil("1234 FD", 4);
        Motorsykkel motorsykkel = new Motorsykkel("2340 FR", 4000);
        parkeringbil.parkere(bilen);
        parkeringMotorsykkel.parkere(motorsykkel);
        parkeringbil.skrivInfo();
        parkeringMotorsykkel.skrivInfo();
    
    }
}
