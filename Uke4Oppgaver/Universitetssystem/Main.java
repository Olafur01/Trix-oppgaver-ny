package Uke4Oppgaver.Universitetssystem;

public class Main {
    public static void main(String[] args){
        Bachelorstudent jens = new Bachelorstudent("Jens", 24, "Introduction to Programming", "UiO");
        jens.writeInfo();
        Masterstudent mathias = new Masterstudent("Mathias", 28, "Algorithms", "UCLA");
        System.out.println();
        mathias.writeInfo();
    }
}
