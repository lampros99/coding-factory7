package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
 * Να λαμβάνει ως input έναν διψήφιο ακέραιο
 * και να υπολογίζει και να εκτυπώνει το άθροισμα των ψηφίων του.
 * για παράδειγμα αν ο χρήστης δώσει τον ακέραιο 15 , θα
 * πρέπει το αποτέλεσμα να είναι 1 + 5 = 6
 */
public class DigitsSum {
    public static void main(String[] args) {

        // Αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int leftDigits = 0;
        int rightDigits = 0;
        int inputNum;
        int sum = 0;

        //εντολές
        System.out.println("Δώσε ακέραιο");
        inputNum = in.nextInt();

        leftDigits = inputNum / 10;
        rightDigits = inputNum % 10;
        sum = leftDigits + rightDigits;

        System.out.printf("Input num: %d, left digit : %d, right digit: %d Sum: %d",
                inputNum, leftDigits, rightDigits, sum);


    }
}
