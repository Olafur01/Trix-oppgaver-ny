class Nedover implements Runnable {
    private int verdi = Integer.MAX_VALUE;
    Tallmonitor monitor;

    Nedover(Tallmonitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void run() {
        boolean fortsett = monitor.detStoerste(verdi);
        while(fortsett){
            verdi--;
            fortsett = monitor.detStoerste(verdi);
        }
        System.out.println("STOPP. Traaden Nedover stoppet paa tallet " + verdi);
    }
    
}
