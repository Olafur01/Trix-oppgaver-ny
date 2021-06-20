/*import java.util.concurrent.*;  
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class NtheTall  {
    private Lock tallLaas;
    private Condition ikkeNeste;


    NtheTall(int n){
        tallLaas = new ReentrantLock();
        ikkeNeste = tallLaas.newCondition();
        NtheMonitor monitor = new NtheMonitor();

    }
    public static void main(String[] args){
        
        for (int i = 0; i < 10; i++){
            new Thread(new MinRun(10)).start();
        }
    }

    class NtheMonitor{
        private int tall = -1;

        public void skrivUt(int i){
            tallLaas.lock();
            try{
                while(i - 1 != tall){
                    // Hvis et traaden ikke gir fra som ikke er nederest i rekken, saa maa den vente;
                    ikkeNeste.await();
                }
                // traaden gir fra seg neste tall i rekken
                tall = i;
                System.out.println(tall);
                ikkeNeste.signalAll();
            }
            catch (InterruptedException e){
                System.out.println("error i utskriffunksjonen");
            }
            finally{
                tallLaas.unlock();
            }
        }
    }
}
*/
