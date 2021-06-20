package Figur;

public class Main {
    public static void main(String [] args){
        Figur rektangel = new Rektangel(4.0, 5.0);
        Figur sirkel = new Sirkel(4.55);

        System.out.println(sirkel.beregnAreal());
        System.out.println(rektangel.beregnAreal());
        System.out.println(sirkel.beregnOmkrets());
        System.out.println(rektangel.beregnOmkrets());
    }
}
