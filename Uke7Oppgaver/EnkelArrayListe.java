import java.util.Iterator;


public class EnkelArrayListe implements Iterable<String> {
    private String[] arr;
    private int maksStoerrelse;
    private int stoerrelse = 0;


    EnkelArrayListe(int maks){
        maksStoerrelse = maks;
        arr = new String[maksStoerrelse];
    }

    public void leggInn(String nyStreng){
        if (stoerrelse >= maksStoerrelse){
            throw new IllegalStateException("Ikke Mer Plass i Arrayen");
        }
        arr[stoerrelse++] = nyStreng;
    }


    @Override
    public Iterator<String> iterator() {
        return new ListeIterator();
    }

    public class ListeIterator implements Iterator<String>{
        private int gjelendeIndeks = 0;
        
        
        @Override
        public boolean hasNext() {
            return gjelendeIndeks < stoerrelse;
        }

        @Override
        public String next() {
            return arr[gjelendeIndeks++];
        }

    }
    
}
