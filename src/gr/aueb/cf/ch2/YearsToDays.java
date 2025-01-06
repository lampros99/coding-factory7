package gr.aueb.cf.ch2;
/*
 * Convert years (age) to days
 */
import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
             // Δήλωση και αρχικοποίηση μεταβλητών
            final int DAYS_PER_YEAR = 365;
            int age = 0;
            int days = 0;
            // Εντολές
            System.out.println("Please insert your age");
            age = scanner.nextInt();

            days = age * DAYS_PER_YEAR;
           // Εκτύπωση των αποτελεσμάτων
        System.out.println("Age in years: " + age + " , Age in days: " + days);
    }
}
