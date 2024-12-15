package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert two intengers");
                num1 = in.nextInt();
                num2 = in.nextInt();
                if (num1 == 0) {
                    System.out.println("You cannot to use a zero.Please try again!");
                    continue;
                }

                result = num1 / num2;

                System.out.printf("%d / %d = %d\n", num1, num2, result);

            }catch (ArithmeticException e){

                System.out.println( e.getMessage() + " " + "Try again!!");
            }
            System.out.println("Thanks for using my app");
        }


    }
}
