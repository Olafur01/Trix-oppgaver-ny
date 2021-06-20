package Uke4Oppgaver.Universitetssystem;

public class Researcher extends Employee{
    protected String researchArea;

    public Researcher(String name, int age, double salary, String reasearchArea){
        super(name, age, salary);
        this.researchArea = reasearchArea;
    }

    public void writeInfo(){
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Salary: " + this.salary +
                "\n" + "Research Area:"  + this.researchArea);
    }
}
