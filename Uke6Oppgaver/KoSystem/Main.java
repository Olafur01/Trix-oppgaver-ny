package KoSystem;

public class Main {
    public static void main (String [] args){
        Person jens = new Person ("Jens", "Frukt");
        Person maria = new Person ("Maria", "Dorull");
        Person jacob = new Person ("Jacob", "Pizza");
        Person henrik = new Person ("Henrik", "Hamburger");
        Person thea = new Person ("Thea", "Godteri");
        Butikk coop = new Butikk();
        coop.entreButikk(jens);
        coop.entreButikk(maria);
        coop.entreButikk(jacob);
        coop.entreButikk(thea);
        coop.entreButikk(henrik);
        coop.kassa();
    }
}
