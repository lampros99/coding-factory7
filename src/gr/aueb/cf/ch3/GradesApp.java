package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης θα δινει:
 * 1. Τους συνολικους βαθμους
 * 2. το πληθος των μαθηματων
 *
 * Θα υπολογιζει τον μεσο ορο και θα χαρακτηριζει "Αριστα" αν ειναι >= 9,
 * 'Πολυ Καλα' αν ο μ.ορος ειναι >= 7 και 'Καλως' αν θα ειναι ο μ.ορος >=5
 * και 'Αποτυχια' αν ο μ.ορος ειναι < 5
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

        average =  totalMarks / courseCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(1);
        }

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
