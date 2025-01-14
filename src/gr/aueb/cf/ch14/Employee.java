package gr.aueb.cf.ch14;

public class Employee extends Person{

    private double salary;

    public Employee(){

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(long id, String firstname, String lastname, double salary) {
        super(id, firstname, lastname);
        this.salary = salary;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Gets a salary.");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Speaks a lot.");
    }
}
