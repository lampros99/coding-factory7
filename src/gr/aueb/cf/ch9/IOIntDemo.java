package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβάζει ενα αρχείο ακεραίων και γράφει
 * σε ενα άλλο το άθροισμα και τον μέσο όρο.
 */
public class IOIntDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\User\\file\\file8.txt"));
        PrintStream ps = new PrintStream("C:\\Users\\User\\file\\file8-out.txt");
        String token;
        int num = 0, sum = 0, count = 0;
        double average;

        while (in.hasNext()) {
            token = in.next();
            if(isInt(token)){
                num = Integer.parseInt(token);
                count++;
                sum+= num;
            }
        }
            average = (double) sum / count;
            ps.printf("Tο άθροισμα είναι %d%n", sum);
            ps.printf(Locale.ENGLISH, "O μέσος όρος είναι %.2f", average);
            in.close();
            ps.close();

    }
    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            System.err.println("Error." + e.getMessage());
            return false;
        }
    }

}