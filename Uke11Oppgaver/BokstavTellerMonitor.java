import java.util.*;
import java.util.concurrent.locks.*;



public class BokstavTellerMonitor {
    private ArrayList<String> ord;
    private char bokstav;
    private Lock laas = new ReentrantLock();

    public BokstavTellerMonitor(ArrayList<String> ord, char bokstav){
        this.ord = ord;
        this.bokstav = bokstav; 
    }

    public char hentBokstaven(){
        return bokstav;
    }

    public String hentOrd(){
        laas.lock();
        try{
            if (ord.isEmpty()){
                return null;
            }
            else{
                return ord.remove(ord.size()-1);
            }
        }
        finally{
            laas.unlock();
        }
    }


}
