package Uke3Oppgaver;

public class Rektangel extends Figur {
    private double height;
    private double length;

    public Rektangel(double h, double l){
        height = h;
        length = l;
    }

    @Override
    public double areal(){
        return height*length;
    }
}
