package gr.aueb.cf.ch12;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();             //Invoke Default Constructor.
        Student bob = new Student(2, "Bob", "D.");   //Invoke Overloaded Constructs end populate instance.

        bob.setLastname("Dylan");

        student.setId(1);                   // student.id = 1;
        student.setFistname("Alice");       // student.fistname = "Alice";
        student.setLastname("W.");          // student.lastname = "W.";




        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFistname());
        System.out.println("Lastname: " + bob.getLastname());

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFistname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("'Student instances' count: " + Student.getStudentsCount());

//        System.out.println("Id: " + student.id);
//        System.out.println("Firstname: " + student.fistname);
//        System.out.println("Lastname: " + student.lastname);
    }
}
