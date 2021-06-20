public class BokstavTeller implements Runnable{
    
    BokstavTellerMonitor monitor;

    public BokstavTeller(BokstavTellerMonitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        String ord = monitor.hentOrd();
        char bokstav = monitor.hentBokstaven();
        char [] charArray = ord.toCharArray();
        int teller = 0;

        for (Character c: charArray){
            if (c == bokstav){
                teller++;
            }
        }
        System.out.println(bokstav + " forekommer " + teller + " ganger i ordet " + ord);
    }

        
}









/*
Oppgave a bokstav teller
public class BokstavTeller implements Runnable{
    String ord;
    char bokstav;

    public BokstavTeller(String ord, char bokstav){
        this.ord = ord;
        this.bokstav = bokstav;
    }


    @Override 
    public void run(){
        char [] charArray = ord.toCharArray();
        int teller = 0;

        for (Character c: charArray){
            if (c == bokstav){
                teller++;
            }
        }
        System.out.println(bokstav + " forekommer " + teller + " ganger i ordet " + ord);
    }
}
*/

