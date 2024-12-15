package gr.aueb.cf.ch8;

public class Arithmetic1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;


        try {
            result = num1 / num2;

        } catch (ArithmeticException e){
            System.out.println(e.getMessage()); // περναει εναν μυνημα στον χρηστη.
        }



        System.out.println("This line is not execute");
    }
}
