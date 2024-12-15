package gr.aueb.cf.ch6;

/**
 * Δηλωση και αρχικοποιηση ενος πινακα
 * new
 * unsized init
 * array initializer
 * print τα στοιχεια ενος πινακα
 */

public class ArrayInt {
    public static void main(String[] args) {
        int[] arr = new int [3]; // declare and init
        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
