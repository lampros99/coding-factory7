package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει:
 * 1. Τους συνολικούς βαθμούς
 * 2. το πλήθος των μαθημάτων
 * Θα υπολογίζει τον μέσο όρο και θα χαρακτηρίζει "'Αριστα" αν είναι >= 9,
 * 'Πολύ Καλά' αν ο μέσος όρος είναι >= 7 και 'Καλώς' αν θα ειναι ο μέσος όρος >=5
 * και 'Αποτύχια' αν ο μέσος όρος έιναι < 5
 */

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int courseCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();



        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        courseCount = scanner.nextInt();

        if (courseCount <= 0) {
            System.out.println("Courses count myst not be negative or zero");
            System.exit(1);
        }


        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(1);
        }

        average =  totalMarks / courseCount;

        if (average >= 9) {
            System.out.println("Exellent");
        }else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }

    }

}
