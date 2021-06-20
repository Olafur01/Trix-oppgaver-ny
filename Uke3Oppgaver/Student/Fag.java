package Uke3.Student;

import java.util.HashMap;

public class Fag {
    private String fagNavn;
    private HashMap<String, Student> studenterIFag = new HashMap<String, Student>();

    public Fag(String fag){
        fagNavn = fag;
    }   

    public String hentNavn(){
        return fagNavn;
    }

    public void leggTilStudent(Student nyStudent){
        if (erStudentIFag(nyStudent)){
            System.out.println(nyStudent.hentNavn() + " er allered innmeldt i fag " + fagNavn);
        }
        else{
            studenterIFag.put(nyStudent.hentNavn(), nyStudent);
        }
    }

    public void fjernStudent(Student student){
        if(erStudentIFag(student)){
            studenterIFag.remove(student);
        }
        else{
            System.out.println(student.hentNavn() + " er tar ikke fag " + fagNavn);
        }
    }

    public void skrivUtStudenter(){
        for (String student:studenterIFag.keySet()){
            System.out.println(student);
        }
    }

    public boolean erStudentIFag(Student check){
        return studenterIFag.containsKey(check.hentNavn());
    }

    public int antStudenter(){
        return studenterIFag.size();
    }

    public HashMap<String, Student> listeAvStudenter(){
        return studenterIFag;
    }

    public void fjernMegFraStudenter(){
        for(Student studentSomTarFaget : studenterIFag.values()){
          studentSomTarFaget.fjernFag(this);
        }
      }
}
