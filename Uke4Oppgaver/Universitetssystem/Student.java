package Uke4Oppgaver.Universitetssystem;

public class Student extends Person{
    protected String course;
    protected String university;

    public Student(String name, int age, String course, String university){
        super(name, age);
        this.course = course;
        this.university = university;
    }

    public void writeInfo(){
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Course: " + this.course +
                "\n" + "University:"  + this.university);
    }

}
