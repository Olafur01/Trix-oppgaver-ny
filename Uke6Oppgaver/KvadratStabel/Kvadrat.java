package KvadratStabel;

class Kvadrat {
    private double width;
    
    Kvadrat(double width){
        this.width = width;
    }

    public double areal(){
        return width * width;
    }
}
