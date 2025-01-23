package gr.aueb.cf.ch16.abstract_class;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat(1l, "alice");

        System.out.println(cat);

        cat.speak();
        cat.eat();

    }
}
