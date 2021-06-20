import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.io.PrintWriter;


public class StudentSystem {
    private HashMap<String, Fag> listeAvFag = new HashMap<String, Fag>();
    private HashMap<String, Student> listeAvStudenter = new HashMap<String, Student>();
    private Scanner tastatur = new Scanner(System.in);
    
    public void lesFraFil(String filnavn) throws Exception{
        Scanner fil = new Scanner(new File(filnavn));
        String linje;
        Fag fag = null;
        while (fil.hasNextLine()){
            linje = fil.nextLine();
            if (linje.charAt(0) == '*'){
                fag = new Fag(linje.substring(1));
                listeAvFag.put(fag.hentNavn(), fag);
            }
            else{
                Student student;
                if (listeAvStudenter.containsKey(linje)){
                    student = listeAvStudenter.get(linje);
                }
                else{
                    student = new Student(linje);
                    listeAvStudenter.put(student.hentNavn(), student);
                }
                student.leggTilFag(fag);
                fag.leggTilStudent(student);
            }
        }
        fil.close();
    }

    public void meny(){
        System.out.println("*************STUDENTSYSTEM***********");
        System.out.println("1: Legg til ny student.");
        System.out.println("2: Legg til nytt fag.");
        System.out.println("3: Skriv ut alle studenter som tar et spesifikt fag.");
        System.out.println("4: Skriv ut alle fag en spesifikk student tar");
        System.out.println("5: Meld opp en student til et emne.");
        System.out.println("6: Meld av en student til et emne.");
        System.out.println("7: Fjern en student fra systemet.");
        System.out.println("8: Fjern et fag fra systemet.");
        System.out.println("9: Finne ut hvilket fag som blir tatt av flest studenter.");
        System.out.println("10: Finne ut hvilken student som tar flest fag.");
        System.out.println("11: Skriv ut alle fag og hvilke studenter som tar de.");
        System.out.println("0: Avslutt.");
    }
    
    public void ordrelokke(){
        int inputFraBruker = -1;
    
        while(inputFraBruker != 0){
          if(inputFraBruker == 1){
            leggTilNyStudent();
          } else if(inputFraBruker == 2){
            leggTilNyttFag();
          } else if(inputFraBruker == 3){
            skrivUtAlleStudenterSomTarFag();
          } else if(inputFraBruker == 4){
            skrivUtAlleFagSomStudentTar();
          } else if(inputFraBruker == 5){
            meldOppStudentTilEmne();
          } else if(inputFraBruker == 6){
            meldAvStudentTilEmne();
          } else if(inputFraBruker == 7){
            slettStudent();
          } else if(inputFraBruker == 8){
            slettFag();
          } else if(inputFraBruker == 9){
            finnMestPopulaereFag();
          } else if(inputFraBruker == 10){
            finnMestArbeidsommeStudent();
          } else if(inputFraBruker == 11){
            skrivUtAlleFagMedTilhorendeStudenter();
          }
          meny();
          inputFraBruker = Integer.parseInt(tastatur.nextLine());
        }
    
      }
    
      public void skrivUtAlleFagMedTilhorendeStudenter(){
        for(Fag fag : listeAvFag.values()){
          System.out.println("Fag: " + fag.hentNavn());
          HashMap<String, Student> listeAvStudenterSomTarFag = fag.listeAvStudenter();
          for(Student studentSomTarFag : listeAvStudenterSomTarFag.values()){
            System.out.println(studentSomTarFag.hentNavn());
          }
        }
      }
    
      public void skrivTilFil(String filnavn) throws Exception{
        PrintWriter skriver = new PrintWriter(filnavn);
        for(Fag fag : listeAvFag.values()){
          skriver.println("*" + fag.hentNavn());
          HashMap<String, Student> listeAvStudenterSomTarFag = fag.listeAvStudenter();
          for(Student studentSomTarFag : listeAvStudenterSomTarFag.values()){
            skriver.println(studentSomTarFag.hentNavn());
          }
        }
        skriver.close();
      }
    
      public void leggTilNyStudent(){
        System.out.println("Hva heter studenten?");
        String navn = tastatur.nextLine();
        listeAvStudenter.put(navn, new Student(navn));
    
      }
    
      public void leggTilNyttFag(){
        System.out.println("Hva heter faget?");
        String fagkode = tastatur.nextLine();
        listeAvFag.put(fagkode, new Fag(fagkode));
      }
    
      public void skrivUtAlleStudenterSomTarFag(){
        System.out.println("Hvilket fag vil du se alle studenter til?");
        Fag fag = listeAvFag.get(tastatur.nextLine());
        fag.skrivUtStudenter();
      }
    
      public void skrivUtAlleFagSomStudentTar(){
        System.out.println("Hvilken student vil du se alle fagene til?");
        Student student = listeAvStudenter.get(tastatur.nextLine());
        student.skrivUtFag();
      }
    
      public void meldOppStudentTilEmne(){
        System.out.println("Hvilken student vil du melde opp?");
        Student student = listeAvStudenter.get(tastatur.nextLine());
    
        System.out.println("Hvilket fag vil du melde opp til?");
        Fag fag = listeAvFag.get(tastatur.nextLine());
    
        fag.leggTilStudent(student);
        student.leggTilFag(fag);
      }
    
      public void meldAvStudentTilEmne(){
        System.out.println("Hvilken student vil du melde av?");
        Student student = listeAvStudenter.get(tastatur.nextLine());
    
        System.out.println("Hvilket fag vil du melde av til?");
        Fag fag = listeAvFag.get(tastatur.nextLine());
    
        fag.fjernStudent(student);
        student.fjernFag(fag);
    
      }
    
      public void slettStudent(){
        System.out.println("Hvilken student vil du fjerne?");
        Student student = listeAvStudenter.get(tastatur.nextLine());
    
        student.meldMegAvAlleFag();
        listeAvStudenter.remove(student);
      }
    
      public void slettFag(){
        System.out.println("Hvilket fag vil du fjerne?");
        Fag fag = listeAvFag.get(tastatur.nextLine());
    
        fag.fjernMegFraStudenter();
        listeAvFag.remove(fag);
      }
    
      public void finnMestPopulaereFag(){
        Fag fagMedMestFlestStudenterHittil = null;
    
        for(Fag fag : listeAvFag.values()){
          if(fagMedMestFlestStudenterHittil == null){
            fagMedMestFlestStudenterHittil = fag;
          } else {
            if(fagMedMestFlestStudenterHittil.antStudenter() < fag.antStudenter()){
              fagMedMestFlestStudenterHittil = fag;
            }
          }
        }
    
        System.out.println("Mest populaere fag er: " + fagMedMestFlestStudenterHittil.hentNavn());
      }
    
      public void finnMestArbeidsommeStudent(){
        Student studentMedMestFlestFagHittil = null;
        
        for(Student student : listeAvStudenter.values()){
          if(studentMedMestFlestFagHittil == null){
            studentMedMestFlestFagHittil = student;
          } else {
            if(studentMedMestFlestFagHittil.mengdeFag() < student.mengdeFag()){
              studentMedMestFlestFagHittil = student;
            }
          }
        }
        System.out.println("Mest arbeidsomme student er: " + studentMedMestFlestFagHittil.hentNavn());
      }
    
}


