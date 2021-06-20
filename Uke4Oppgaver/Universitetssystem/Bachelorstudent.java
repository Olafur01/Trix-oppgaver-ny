package Uke4Oppgaver.Universitetssystem;

public class Bachelorstudent extends Student{
    protected boolean access = false;

    public Bachelorstudent(String name, int age, String course, String university){
        super(name, age, course, university);
    }

    @Override
    public void writeInfo(){
      super.writeInfo();
      System.out.println("Type of student: Bachelor");
      System.out.println("Has access after 10: " + String.valueOf(this.access));
    }
}
