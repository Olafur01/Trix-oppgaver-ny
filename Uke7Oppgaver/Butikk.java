import java.util.Iterator;

public class Butikk implements Iterable<Person>{
    private Person person;

    public void entreButikk(Person p){
        if (this.person == null){
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

    @Override
    public Iterator<Person> iterator() {
        return new ButikkIterator();
    }

    private class ButikkIterator implements Iterator<Person>{
        private Person denne;

        public ButikkIterator(){
            denne = person;
          }

        @Override 
        public boolean hasNext(){
            return denne != null;
        }

        @Override
        public Person next() {
            Person data = denne;
            denne = denne.hentNeste();
            return data;
        }
    }
}
