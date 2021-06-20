class Post{
    protected String beskrivelse;
    protected String mottaker;

    public Post(String b, String m){
        beskrivelse = b;
        mottaker = m;
    }

    public String hentBeskrivelse(){
        return beskrivelse;
    }

    public String hentMottakter(){
        return mottaker;
    }

    public String toString(){
        return "Mottaker: " + mottaker + " - Beskrivelse: " + beskrivelse;
    }
}