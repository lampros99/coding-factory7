package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Μετατρεπει μερες ωρες λεπτα και δευτερολεπτα.
 * Σε συνολικα δευτερολεπτα.
 * Ο χρηστης δινει τα δεδομενα και εκτυπωνεται το τελικο αποτελεσμα.
 */
public class DateTimeToSecondsConverter {
    public static void main(String[] args) {

        //Aρχικοποiηση των μεταβλητών
        Scanner in = new Scanner(System.in);
        final int SECONTS_PER_DAY = 3600 * 24;
        final int SECONTS_PER_HOURS = 3600;
        final int SECONTS_PER_MINUTE = 60;


        int inputDays ;
        int inputHours ;
        int inputMinutes ;
        int inputSeconds ;
        int totalSeconds = 0;


        //Εντολές

        System.out.println("Please insert days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECONTS_PER_DAY + inputHours * SECONTS_PER_HOURS + inputMinutes * SECONTS_PER_MINUTE + inputSeconds;

        System.out.printf(Locale.US, "Total seconds: %,d seconds\n ", totalSeconds);




    }
}
