package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Θα δωσει ο χρηστης εναν ακεραιο ως output και γινεται ο πολλαπλασιασμος
 * Apo 1 - 10
 */
public class multplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;


        System.out.println("Enter an integer");
        num = scanner.nextInt();

        while (i <= 20) {
          //  System.out.println(num + " * " + i + " = " + (num * i));
            System.out.printf("%d * %02d = %d\n", num , i, num * i);
            i++;
        }



    }
}