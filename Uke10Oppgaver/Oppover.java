class Oppover implements Runnable{
    private int verdi = Integer.MIN_VALUE;
    private Tallmonitor monitor;

    public Oppover(Tallmonitor monitor){
        this.monitor = monitor;
    }


    @Override
    public void run() {
        boolean fortsett = monitor.detMinste(verdi);
        while(fortsett){
            verdi--;
            fortsett = monitor.detMinste(verdi);
        }
        System.out.println("STOPP. Traaden Oppover stoppet paa tallet " + verdi);
        
    }
    
}
