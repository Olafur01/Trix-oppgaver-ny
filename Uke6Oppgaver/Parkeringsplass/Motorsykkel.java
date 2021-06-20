package Parkeringsplass;

class Motorsykkel {
    private String regNr;
    private int motorstoerrelse;
    
    Motorsykkel(String regNr, int motorstoerrelse){
        this.regNr = regNr;
        this.motorstoerrelse = motorstoerrelse;
    }

    public String toString(){
        return "Motorsykkel: " + regNr + "\nMotor stoerrelse: " + motorstoerrelse + " kubikkcentimenter";
    }
}
