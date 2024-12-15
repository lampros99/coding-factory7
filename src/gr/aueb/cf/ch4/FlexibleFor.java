package gr.aueb.cf.ch4;
/**
 * ένα πρόγραμμα που χρησιμοποιεί τη δομή επανάληψης for
 * για να τυπώσει μια ακολουθία αριθμών από το startVal έως το endVal
 * με ένα καθορισμένο step (βήμα).
 */

import java.util.Scanner;

public class FlexibleFor {
    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;

        System.out.println("please enter start, end, step");
        startVal = scanner.nextInt();
        endVal = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startVal; i <= endVal; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
