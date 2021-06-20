package Exceptions;

class Bokhylle {
    private Bok[] boeker;

    public Bokhylle (int antPlasser) {
        boeker = new Bok[antPlasser];
    }

    //Forsoeker aa sette inn en bok paa foerste ledige plass i bokhyllen
    public void settInn(Bok b) throws DuplikatException, IkkeMerPlassException{

        // Gaar gjennom hele bokhyllen, sjekker om det er ledig plass (== null) og om det ikke eksisterer 
        // duplikater
        for (int i = 0; i < boeker.length; i++) {
            // boken ligger allerede inne
            if (boeker[i] != null && boeker[i].toString().equals(b.toString())) {
                throw new DuplikatException(b.toString());   
            }

            if (boeker[i] == null){
                
                boeker[i] = b;
                return;
            }
        }
        // Har gaatt gjennom hele liten uten aa finne plass, kast ikke mer plass exception 
        throw new IkkeMerPlassException(b.toString());
    }

    public void skrivBoeker() {
        for (Bok b: boeker) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }
}
