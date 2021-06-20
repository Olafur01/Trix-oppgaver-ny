import java.util.concurrent.*;

public class OrdTraad implements Runnable{
    String [] listeMedOrd;
    String ordViSoeker;
    OrdMonitor monitor;
    CountDownLatch cdl;
    int startIndeks;
    int sluttIndeks;

    public OrdTraad(String[] listeMedOrd, 
    int startIndeks, int sluttIndeks, String ordViSoeker, OrdMonitor monitor, CountDownLatch cdl){
        this.listeMedOrd = listeMedOrd;
        this.ordViSoeker = ordViSoeker;
        this.monitor = monitor;
        this.cdl = cdl;
        this.startIndeks = startIndeks;
        this.sluttIndeks = sluttIndeks;

    }
    @Override 
    public void run(){
        for(int i = startIndeks; i < sluttIndeks; i++){
            if(listeMedOrd[i].equals(ordViSoeker)){
                monitor.fantOrdet();
            }
        }
        cdl.countDown();
    }
}
