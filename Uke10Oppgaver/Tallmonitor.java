import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tallmonitor {
    private int detMinste = Integer.MIN_VALUE;
    private int detStoerste = Integer.MAX_VALUE;
    private Lock laas = new ReentrantLock();

    public boolean detMinste(int nyMinste){
        laas.lock();
        try{
            if(detStoerste <= detMinste){return false;}
            detMinste = nyMinste;
            return true;
        }
        finally{
            laas.unlock();
        }
    }

    public boolean detStoerste(int nyStoerste){
        laas.lock();
        try{
            if(detStoerste <= detMinste){return false;}
            detStoerste = nyStoerste;
            return true;
        }
        finally{
            laas.unlock();
        }
    }
}