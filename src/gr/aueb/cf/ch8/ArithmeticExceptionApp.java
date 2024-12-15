package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert two numbers");
                num1 = in.nextInt();
                if (num2 == 0) break;
                num2 = in.nextInt();

                System.out.printf("%d / %d = %d\n", num1, num2, result);
            } catch (ArithmeticException e) {
                System.out.println("Error.. please try again");
            }
        }
        System.out.println("Thanks for using my app!!");

    }
}
