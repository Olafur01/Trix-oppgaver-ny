package GeneriskBeholder;

public class Main {
    public static void main(String[] args){
        Beholder<Sirkel> sirkelBeholder = new Beholder<>();
        
        Sirkel sirkel1 = new Sirkel(3.1);
        Sirkel sirkel2 = new Sirkel(34.2);
        Kvadrat falskSirkel = new Kvadrat(33);

        sirkelBeholder.settInn(sirkel1); 
        sirkelBeholder.settInn(sirkel2);
        // sirkelBeholder.settInn(falskSirkel);
    }
    
}
