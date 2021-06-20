class Person implements Comparable<Person> {
    private String navn;
    private int foedselsaar;
    private Person mor;
    private Person far;
    
    public Person(int foedelseaar, String navn, Person mor, Person far){
        this.navn = navn;
        this.foedselsaar = foedelseaar;
        this.mor = mor;
        this.far = far;
    }

    public Person finnEldsteKjenteForfader(){
        if (mor == null){
            if (far == null){
                return this;
            }
            else{
            return far.finnEldsteKjenteForfader();
            }
        }

        if (far == null){
            return mor.finnEldsteKjenteForfader();
        }

        Person morsiden = mor.finnEldsteKjenteForfader();
        Person farsiden = far.finnEldsteKjenteForfader();
        
        if (morsiden.compareTo(farsiden) < 0){
            return morsiden;
        }
        else{
            return farsiden;
        }

    }

    public Person hentFar(){
        return far;
    }

    public Person hentMor(){
        return mor;
    }

    public int hentAar(){
        return foedselsaar;
    }

    public String hentNavn(){
        return navn;
    }

    @Override
    public String toString(){
        return navn;
    }

    @Override
    public int compareTo(Person sammenlignPerson) {
        return this.foedselsaar - sammenlignPerson.hentAar();
    }
}

