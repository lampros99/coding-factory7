package gr.aueb.cf.ch9;

import java.io.*;
/**
 * Παίρνει αριθμούς απο ένα txt και τους ταξινομεί σε έναν αλλο txt
 * χώριζοντάς τους σε ζυγούς και περιττούς.
 */
public class NumbersFilterApp {
        public static void main(String[] args) throws IOException {
            File infd = new File("C:\\Users\\User\\file\\Numbers1.txt");
            File outfd = new File("C:\\Users\\User\\file\\numbers.txt");
            String line;
            String[] token;

            int number;

            try (BufferedReader br = new BufferedReader(new FileReader(infd));
                 PrintWriter pw = new PrintWriter(outfd)){
                while ((line = br.readLine()) != null){
                    token = line.split("\\s+");

                    for(String tokens : token){
                        if(isInteger(tokens)){
                            number = Integer.parseInt(tokens);

                            if(number % 2 == 0){
                                pw.println("Even: " + number);
                            }

                            if(number % 2 != 0){
                                pw.println("Odd: " + number);
                            }

                            if ( number % 2 != 0 && number % 2 != 1){
                                pw.println("others: " + number);
                            }
                        }
                        pw.println("------");
                    }
                }
                System.out.println("Η διαδικασία ολοκληρώθηκε");
            }catch (Exception e){
                System.err.println("Error."+ e.getMessage());
            }
        }
        public static boolean isInteger(String s){

            try {
                Integer.parseInt(s);
                return true;
            }catch (NullPointerException e){
                System.err.println("Error." + e.getMessage());
            }
            return false;
        }
}

