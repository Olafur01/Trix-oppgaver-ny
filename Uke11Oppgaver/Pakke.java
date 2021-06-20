public class Pakke extends Post {
    public Pakke(String b, String m){
        super(b, m);
    }

    @Override
    public String toString(){
        return "Mottaker: " + mottaker + " - Pakke: Bekskrivelse: " + beskrivelse; 
    }
}
