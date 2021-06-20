package Uke3Oppgaver;

public class Trekant extends Figur{
    private double height;
    private double base;

    public Trekant(double h, double b){
        height = h;
        base = b;
    }

    @Override
    public double areal(){
        return (height * base)/2;
    }
}
