package Uke4Oppgaver.Universitetssystem;

public class Employee extends Person{
    protected double salary;

    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public void writeInfo(){
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Salary: " + this.salary);
    }
}
