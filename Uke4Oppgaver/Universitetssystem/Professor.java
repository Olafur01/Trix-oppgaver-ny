package Uke4Oppgaver.Universitetssystem;

public class Professor extends Employee{
    protected String researchArea;
    protected String course;

    public Professor(String name, int age, double salary, String researchArea, String course){
        super(name, age, salary);
        this.researchArea = researchArea;
        this.course = course;
    }

    public void writeInfo(){
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Salary: " + this.salary +
                "\n" + "Research Area:"  + this.researchArea + "\n" +  "Taught course: " +this.course);
    }
}
