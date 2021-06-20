class Person {
    private String navn;
    private String gjenstand;
    private Person neste;
    
    Person(String navn, String gjenstand){
        this.navn = navn;
        this.gjenstand = gjenstand;
    }

    public void setNeste(Person neste){
        this.neste = neste;
    }

    public Person hentNeste(){
        return this.neste;
    }

    public String hentNavn(){
        return this.navn;
    }

    public String hentGjenstand(){
        return this.gjenstand;
    }

    public String toString(){
        return "Navn: " + navn + "\nGjenstand: " + gjenstand + "\nNeste person: " + neste.hentNavn();
    }
}
