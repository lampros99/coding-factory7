package gr.aueb.cf.ch3;
/*
 * ypologizei to anthrisma ton artion
 * apo to 2 mexri ekei pou dinei o xristis
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
