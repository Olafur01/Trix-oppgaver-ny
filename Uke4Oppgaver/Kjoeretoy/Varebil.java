package Kjoeretoy;

class Varebil extends Kjoeretoy{
    private final double MAKSVEKT;
    private final double AARSAVGIFT;

    public Varebil(String e, String f, String s, double maks){
        super(e, f, s);
        MAKSVEKT = maks;
        AARSAVGIFT = 4.0 * MAKSVEKT;
    }

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("Type kjoeretoy: Buss" + "\nMaks vekt: " + MAKSVEKT +
                "\nAarsavgift: " + AARSAVGIFT);
    }

    public double hentAarsavgift(){
        return AARSAVGIFT;
    }
}
