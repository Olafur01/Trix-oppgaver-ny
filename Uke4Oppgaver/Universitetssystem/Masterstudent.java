package Uke4Oppgaver.Universitetssystem;

public class Masterstudent extends Student{
    protected boolean access = true;

    public Masterstudent(String name, int age, String course, String university){
        super(name, age, course, university);
    }

    @Override
    public void writeInfo(){
        super.writeInfo();
        System.out.println("Type of student: Master");
        System.out.println("Has access after 10: " + String.valueOf(this.access));
    }
}

