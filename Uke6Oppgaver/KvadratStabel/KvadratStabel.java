package KvadratStabel;


class KvadratStabel {
    private Node start;

    public void leggPaa(Kvadrat k){
        if (erTom()){
            start = new Node(k);
        }
        else{
            Node mid = start;
            start = new Node(k);
            start.neste = mid;
        }
    }

    public Kvadrat taAv(){
        if (erTom()){
            return null;
        }
        else{
            Node mid = start;
            start = start.neste;
            return mid.kvadrat;

        }
    }

    public boolean erTom(){
        return start == null;
    }


    class Node{
        private Kvadrat kvadrat;
        private Node neste;

        private Node(Kvadrat data){
            this.kvadrat = data; 
        }
    }
}
