package gr.aueb.cf.ch17.callbacks;

public class Main4 {
    public static void main(String[] args) {

        doPrint(Main4::sayHelloCoding); //Method Reference
        doPrint(Main4::sayHelloWorld);
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    public static void sayHelloCoding(){
        System.out.println("Hello Coding!");
    }
}
