class BankRun implements Runnable{
    private int beloepp;
    private Bank bank;

    public BankRun(int beloepp, Bank bank){
        this.beloepp = beloepp;
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            bank.gi(beloepp);
            bank.ta(beloepp);
            System.out.println(bank.saldo());
        }
    }
}
