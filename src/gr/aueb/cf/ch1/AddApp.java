package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δύο ακεραίων
 * με την χρήση μεθόδων
 */
public class AddApp {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     *  adds two intengers
     *
     * @param a the first intenger
     * @param b the second integer
     * @return the sum of the two intenger
     */
    public static int add(int a, int b) {

//        int result = 0;
//
//        result = a + b;
//
//        return result;
        return a + b;
    }

    /**
     * Subtracts two intenger
     * @param a the first integer to substract
     * @param b the second integer
     * @return the sum of two integers
     */
    public static int sub(int a, int b) {
        return a - b;
    }



}
