class BaatHus{
    private Baat[] baatHus;

    BaatHus(int antallPlasser){
        baatHus = new Baat[antallPlasser];
    }

    public void settInn(Baat nyBaat){
        
        boolean sattInn = false;
        int teller = 0;
        
       while(sattInn == false && teller < baatHus.length){
            if (baatHus[teller] == null){
                baatHus[teller] = nyBaat;
                sattInn = true;
                
            }
            teller++;
        }
        
        if (!sattInn){
            System.out.println("Det er ikke plass til flere baater");
        }
    }

    public void skrivUt(){
        for (Baat b: baatHus){
            if (b != null){
            System.out.println(b.hentInfo());
            }
        }
    }
}