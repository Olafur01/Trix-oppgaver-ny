package Hester;

public class Islandshest extends Hest implements KanPasse, KanToelte{
    

    public Islandshest(String n, int a) {
        super(n, a);
    }

    public void passe() {
        System.out.println("Hesten passer, en form for hestevandring");
    }


    public void toelte() {
        System.out.println("Hesten toetler, en form for hestevandring");
    }
}
