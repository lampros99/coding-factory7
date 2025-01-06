package gr.aueb.cf.ch3;
/**
 * Αντιστρέφει εναν ακέραιο
 * P.X 123 -> 321
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reversed= 0;
        int tempNum = 0;
        int rightDigits = 0;

        System.out.println("Enter a positive intenger");
        num = scanner.nextInt();

        //toDo
        tempNum = num;

        while (tempNum > 0 ) {
            rightDigits = tempNum % 10;
            reversed = reversed * 10 + rightDigits;

            tempNum /= 10; // tempNum = tempNum / 10

        }

        System.out.println("The reversed number is: " + reversed);

    }
}
