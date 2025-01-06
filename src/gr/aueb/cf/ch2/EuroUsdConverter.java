package gr.aueb.cf.ch2;

import java.util.Scanner;
/*
* Me in.nextDouble(); Θα μποροώσαμε να βάλουμε και 10,4
 */
public class EuroUsdConverter {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Εντολές
         System.out.println("Δώστε μια τιμή");
         inputEuros = in.nextInt();

         totalUsaCents = inputEuros * PARITY;
         usaDollars = totalUsaCents / 100;
         usaCents = totalUsaCents % 100;
        System.out.printf("%d euros = %d usa dollars , %d usa cents", inputEuros, usaDollars, usaCents );


    }
}
