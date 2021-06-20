package Kjoeretoy;

class Personbil extends Kjoeretoy{
    private final double AARSAVGIFT = 3000;
    private final int SITTEPLASSER;

    public Personbil(String e, String f, String r, int s){
        super(e, f, r);
        SITTEPLASSER = s;
    }

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("Type kjoeretoy: Buss" + "\nAntall plasser: " + SITTEPLASSER +
                "\nAarsavgift: " + AARSAVGIFT);
    }

    public double hentAarsavgift(){
        return AARSAVGIFT;
    }

}
