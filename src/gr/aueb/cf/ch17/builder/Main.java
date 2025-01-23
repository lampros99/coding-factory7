package gr.aueb.cf.ch17.builder;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(4, "1234").build();
        Book book2 = new Book.Builder(4, "4321")
                .author("Al")
                .title("Java")
                .build();
    }
}
