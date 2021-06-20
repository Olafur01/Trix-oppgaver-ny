public class Postman implements Runnable{
    private Postkontor postkontor;

    public Postman(Postkontor postkontor){
        this.postkontor = postkontor;
    }

    @Override 
    public void run(){
        for(int i = 0; i <100; i++){
            if (i % 2 == 0){
                Post p = new Pakke("Hei Pls respond", "Henrik");
                postkontor.leverPost(p);
            }
            else{
                Post p = new Brev("U what m8", "Margrethe");
                postkontor.leverPost(p);
            }
        }
    }
}
