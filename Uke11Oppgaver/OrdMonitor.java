import java.util.concurrent.locks.*;

public class OrdMonitor {
    int antall = 0;
    Lock laas = new ReentrantLock();

    public int hentAntall(){
        return antall;
    }

    public void fantOrdet(){
        laas.lock();
        try{
            antall++;
        }
        finally{
            laas.unlock();
        }
    }
}
