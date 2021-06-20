public class TestBaathus {
   public static void main(String [] args){
       BaatHus baatHus = new BaatHus(3);
       Baat jens = new Baat("123 ff");
       Baat mari = new Baat("123 if");
       Baat jacob = new Baat("123ref");
       Baat thea = new Baat("123 ferk");

       baatHus.settInn(jens);
       baatHus.settInn(mari);
       baatHus.settInn(jacob);
       baatHus.settInn(thea);
       baatHus.skrivUt();
   } 
}
