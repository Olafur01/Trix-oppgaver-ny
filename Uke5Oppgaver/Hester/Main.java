package Hester;

public class Main {

    public static void main(String [] args){
    EngelskFullblodshest jens = new EngelskFullblodshest("jens", 12);
    Islandshest jacob = new Islandshest("Jacob", 23);
    PasoFino jenny = new PasoFino("Jenny", 2);

    jacob.toelte();
    jenny.passe();
    jens.galopp();
    jens.trav();
    jenny.trav();
    }
}
