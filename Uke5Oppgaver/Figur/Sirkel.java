package Figur;

class Sirkel implements Figur {
    
    private double radius;

    public Sirkel(double r){
        radius = r;
    }

    @Override
    public double beregnAreal() {
        return radius * radius * Math.PI;
    }

    @Override
    public double beregnOmkrets() {
        return 2 * radius * Math.PI;
    }

    
}
