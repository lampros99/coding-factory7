package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {
    public static void main(String[] args) {
        File inFd = new File("C:\\Users\\User\\OneDrive\\Desktop\\Εκτυπωση\\21-10-2024\\JAVA\\Tip.txt");
        File outFd = new File("C:\\Users\\User\\OneDrive\\Desktop\\Εκτυπωση\\21-10-2024\\JAVA\\Tip-out.txt");
        String line;
        String[] tokens;

        try(Scanner in = new Scanner(inFd);
            PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s-");

                for (String token : tokens){
                    System.out.println(token.trim() + " ");
                    ps.printf("%s ", token);
                    ps.flush();
                }
                ps.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
