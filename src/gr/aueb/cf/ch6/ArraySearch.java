package gr.aueb.cf.ch6;

/**
 * ευρεση στοιχειου του πινακα
 */

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        final int SECTRET = 4;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SECTRET) {
                found = true;
                break;
            }
        }

        for (int el : arr) {
            if (el == SECTRET) {
                found = true;
                break;
            }
        }



        if (found) {
            System.out.println("Secret found!");
        } else {
            System.out.println("System not found!");
        }

    }
}
