package gr.aueb.cf.ch16.abstract_class;

public class Cat extends Animal{

    public Cat(){
        super();
    }

    public Cat(Long id, String name) {
        super(id, name);
    }

    public String toString(){
        return getId() + ", " + getName();
    }

    @Override
    public void speak() {
        System.out.println("niaou");
    }

    public void eat(){
        super.eat();
        System.out.println("...ate all het food");
    }
}
