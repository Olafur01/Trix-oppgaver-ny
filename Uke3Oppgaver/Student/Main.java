package Uke3.Student;

public class Main {
    public static void main(String[] args)throws Exception{
        StudentSystem nyttSystem = new StudentSystem();
        nyttSystem.lesFraFil("Uke3/emneoppgaver.txt");
        nyttSystem.ordrelokke();
    }
}
