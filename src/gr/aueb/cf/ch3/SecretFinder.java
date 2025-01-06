package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας secret που είναι intenger και
 * ο χρήστης με μια μόνο προσπάθεια προσπαθεί να τον βρεί.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("SECRET FOUND!!");
        } else {  // num != secret
            System.out.println("FALSE !!");
        }

    }
}
