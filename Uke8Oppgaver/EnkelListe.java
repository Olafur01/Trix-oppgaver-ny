class EnkelListe {
    private Node start;

    public void settInnForan(String nyttInnhold) {
        Node ny = new Node(nyttInnhold);
        ny.neste = start;
        start = ny;
    }

    public Node hentFirst(){return start;}

    public void skrivUt() {
        Node tmp = start;
        while (tmp.neste != null) {
            System.out.println(tmp.innhold);
            tmp = tmp.neste;
        }
    }

    public void skrivUtBacklengs(Node n){
        // Base Case;
        if (n == null){
            return;
        }

        // Rekursjonww
        skrivUtBacklengs(n.neste);
        System.out.println(n.innhold);
        
    }

    private class Node {
        private String innhold;
        private Node neste;

        Node(String s) {
            innhold = s;
        }
    }
}