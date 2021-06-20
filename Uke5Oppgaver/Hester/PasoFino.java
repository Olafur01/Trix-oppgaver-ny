package Hester;

class PasoFino extends Hest implements KanPasse {
    

    public PasoFino(String n, int a) {
        super(n, a);
    }


    public void passe() {
        System.out.println("Hesten passer, en form for hestevandring");
    }
}
