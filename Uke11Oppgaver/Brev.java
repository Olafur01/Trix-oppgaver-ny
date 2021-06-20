public class Brev extends Post {

    public Brev(String beskrivelse, String mottaker){
        super(beskrivelse, mottaker);
    }

    @Override
    public String toString(){
        return "Mottaker: " + mottaker + " - BREV - Bekskrivelse: " + beskrivelse;
    }
    
}
