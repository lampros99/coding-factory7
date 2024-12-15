package gr.aueb.cf.ch3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int inputNum = 0;
            int facto = 1;
            int i = 1;

            System.out.println("Please insert input num");
            inputNum = in.nextInt();

            while (i <= inputNum) {
                facto *= i;
                i++;
            }

            System.out.println("Factorial: " + facto);

    }
}
