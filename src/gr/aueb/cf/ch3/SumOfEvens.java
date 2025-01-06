package gr.aueb.cf.ch3;
/*
 * Υπολογίζει το άθροισμα των άρτιων
 * απο το 2 μέχρι εκεί που δίνει ο
 * χρήστης.
 */

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = scanner.nextInt();

        //sum ??

        while (i <= inputNum) {
            sum += 2;
            i += 2;
        }


        System.out.println("The sum of even numbers up to " + inputNum + " is: " + sum);

    }
}
