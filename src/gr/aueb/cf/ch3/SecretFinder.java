package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενας secret  που ειναι intenger και
 * ο χρηστης με μια μονο προσπαθεια προσπαθει να τον βρει
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
