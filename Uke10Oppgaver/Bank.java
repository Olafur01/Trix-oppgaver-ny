import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Bank {
    private int beloepp;
    private Lock bankLaas = new ReentrantLock();

    public Bank(int beloepp){
        this.beloepp = beloepp;
    }

    public int saldo(){
        return beloepp;
    }

    public void ta(int tall){
        bankLaas.lock();
        try{
            beloepp -= tall;
        }
        finally{
            bankLaas.unlock();
        }
    }

    public void gi(int tall){
        bankLaas.lock();
        try{
            beloepp += tall;
        }
        finally{
            bankLaas.unlock();
        }
    }

    public static void main(String [] args){
        Bank bank = new Bank(100);

        for (int i = 0; i < 1000; i++){
            new Thread(new BankRun(i, bank)).start();
        }
    }
}
