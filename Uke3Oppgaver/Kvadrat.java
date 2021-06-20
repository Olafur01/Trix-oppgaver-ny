package Uke3Oppgaver;

public class Kvadrat extends Figur{

    private double side;

    public Kvadrat(double s){
        side = s;
    }

    @Override
    public double areal() {
        return side*side;
    }
}
