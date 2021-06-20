package Parkeringshus;

class Bil {
   private String regNr;
   private int antallPlass;
   
   Bil(String regNr, int antallPlass){
        this.regNr = regNr;
        this.antallPlass = antallPlass;
   }

   public String toString(){
       return "Bil: " + regNr + "\nAntall Plasser: " + antallPlass;
   }
}
