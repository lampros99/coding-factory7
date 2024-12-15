package gr.aueb.cf.ch2;

import java.util.Scanner;

/*
 * Να λαμβανει ως input εναν διψηφιο ακεραιο
 * και να υπολογιζει και να εκτυπωνειτο αθροισμα των ψηφιων του.
 * για παραδειγμα αν ο χρηστης δωσει τον ακεραιο 15 , θα
 * πρεπει το αποτελεσμα να ειναι 1 + 5 = 6
 */
public class DigitsSum {
    public static void main(String[] args) {

        // Αρχικοποιηση μεταβλητων
        Scanner in = new Scanner(System.in);
        int leftDigits = 0;
        int rightDigits = 0;
        int inputNum;
        int sum = 0;

        //εντολες
        System.out.println("Δωσε ακεραιο");
        inputNum = in.nextInt();

        leftDigits = inputNum / 10;
        rightDigits = inputNum % 10;
        sum = leftDigits + rightDigits;

        System.out.printf("Input num: %d, left digit : %d, right digit: %d Sum: %d",
                inputNum, leftDigits, rightDigits, sum);





    }
}
