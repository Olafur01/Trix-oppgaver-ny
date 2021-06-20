package KoSystem;

public class Butikk {
    private Person person;

    public void entreButikk(Person p){
        if (person == null){
            this.person = p;
        }
        else{
            Person mid = this.person;
            while (mid.hentNeste() != null){
                mid = mid.hentNeste();
            }
            mid.setNeste(p);
        }
    }

    public void kassa(){
        while (person != null){
            Person temp = this.person.hentNeste();
            System.out.println(this.person.hentNavn() + " kjoeper " + this.person.hentGjenstand());
            System.out.println("Hade bra " + this.person.hentNavn());
            this.person = temp;
        }
        System.out.println("Det er ingen i koen");
    }
}
