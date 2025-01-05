package gr.aueb.cf.ch12;

public class Scoping {
    static int result = 0;
    public static void main(String[] args) {
        int a = 10, b = 20;

        result = add(a,b);

        System.out.println("sum: " + result);

    }

    public static int add(int a, int b) {
        return  a + b;
    }
}
