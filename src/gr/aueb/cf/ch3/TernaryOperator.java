package gr.aueb.cf.ch3;

/*
 * Demo of ternary oparetor on cammon
 * use case that is conditional assigment
 */

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs = 0;

        System.out.println("Please enter a num");
        num = scanner.nextInt();

/*   if (num >= 0) {
            abs = num;
        } else {
            abs = -num;
        } */

        abs = (num >= 0) ? num : - num;

        System.out.println("abs:" + abs);

    }
}
