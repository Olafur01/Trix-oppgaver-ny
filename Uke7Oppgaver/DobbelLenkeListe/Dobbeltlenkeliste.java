package DobbelLenkeListe;

class Dobbeltlenkeliste<T> {
    private Node hode;

    private class Node{
        private T data;
        private Node neste;
        private Node forrige;

        Node(T data){
            this.data = data;
        }

        public T hentData(){
            return this.data;
        }
    }

    public void settInn(T data){
        Node nyNode = new Node(data);
        if (hode == null){
            hode = nyNode;
        }
        else{
            Node temp = hode;
            while(temp.neste != null){
                temp = temp.neste;
            }
            temp.neste = nyNode;
            nyNode.forrige = temp;
        }   
    }

    public void skrivUt(){
        Node temp = hode;
        while (temp != null){
            System.out.println(temp.hentData());
            temp = temp.neste;
        }
    }


}
