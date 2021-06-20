package Kjoeretoy;

public abstract class Kjoeretoy {
    protected String eierNavn;
    protected String fabrikkNavn;
    protected String regNr;

    public Kjoeretoy(String e, String f, String r){
        eierNavn = e;
        fabrikkNavn = f;
        regNr = r;
    }

    public void skrivUt(){
        System.out.println("Kjoeretoy: " + fabrikkNavn + "\nEier: " + eierNavn + "\nRegisteringsnummer: " + regNr);
    }

    public String hentEierNavn(){
        return eierNavn;
    }

    public String hentFabrikkNavn(){
        return eierNavn;
    }

    public String hentRegNr(){
        return regNr;
    }
}
