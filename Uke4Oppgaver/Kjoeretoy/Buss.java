package Kjoeretoy;

class Buss extends Kjoeretoy{
    private final int antallPlasser;

    public Buss(String s, String f, String r, int ant){
        super(s, f, r);
        antallPlasser = ant;
    }

    @Override
    public void skrivUt(){
        super.skrivUt();
        System.out.println("Type kjoeretoy: Buss" + "\nAntall plasser: " + antallPlasser);
    }

    public int hentAntallPlasser(){
        return antallPlasser;
    }
}
