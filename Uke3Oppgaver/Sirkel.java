package Uke3Oppgaver;
public class Sirkel extends Figur{
    private double radius;

    public Sirkel(double r){
        radius = r;
    }

    @Override
    public double areal(){
        return radius*radius*Math.PI;
    }
}
