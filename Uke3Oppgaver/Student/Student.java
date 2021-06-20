package Uke3.Student;
import java.util.HashMap;
class Student{
    private String navn;
    private HashMap<String,Fag> mineFag = new HashMap<String, Fag>();


    public Student(String navn){
        this.navn = navn;
    }

    public void leggTilFag(Fag fag){
        if (tarFag(fag)){
            System.out.println(navn + " tar allerede faget " + fag.hentNavn());
        }
        else{
            mineFag.put(fag.hentNavn(), fag);
        }
    }

    public String hentNavn(){
        return this.navn;
    }

    public boolean tarFag(Fag fag){
        return mineFag.containsValue(fag);
    }

    public void skrivUtFag(){
        for (Fag fag : mineFag.values()){
            System.out.println(fag.hentNavn());
        }
    }

    public void fjernFag(Fag fag){
        if (tarFag(fag)){
            mineFag.remove(fag);
        }
        else{
            System.out.println(navn + " tar ikke faget " + fag.hentNavn());
        }
    }

    public int mengdeFag(){
        return mineFag.size();
    }

    public void meldMegAvAlleFag(){
        for(Fag fagJegTar : mineFag.values()){
          fagJegTar.fjernStudent(this);
        }
      }
}