package Figur;

class Rektangel implements Figur {
    private double height;
    private double width;
    
    public Rektangel(double h, double w){
        height = h;
        width = w;
    }

    @Override
    public double beregnAreal() {
        return height * width;
    }

    @Override
    public double beregnOmkrets() {
        return height * 2 + width * 2;
    }
}
