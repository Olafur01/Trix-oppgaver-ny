class Kunde implements Runnable{
    private String navn;
    private Postkontor postkontor;

    public Kunde(String navn, Postkontor postkontor){
        this.navn = navn;
        this.postkontor = postkontor;
    }


    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            Post p = postkontor.hentPost(navn);
            if (p != null){
                System.out.println(p);
            }
        }
    }
}
