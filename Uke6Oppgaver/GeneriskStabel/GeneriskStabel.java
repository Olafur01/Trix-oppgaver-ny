package GeneriskStabel;

public class GeneriskStabel<E> {
    private Node start;

    public void leggPaa(E k){
        if (erTom()){
            start = new Node(k);
        }
        else{
            Node mid = start;
            start = new Node(k);
            start.neste = mid;
        }
    }

    public E taAv(){
        if (erTom()){
            return null;
        }
        else{
            Node mid = start;
            start = start.neste;
            return mid.data;

        }
    }

    public boolean erTom(){
        return start == null;
    }


    class Node{
        private E data;
        private Node neste;

        private Node(E data){
            this.data = data; 
        }
    }
} 
