package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("C:\\Users\\User\\OneDrive\\Desktop\\Εκτυπωση\\21-10-2024\\JAVA\\forExceptions.txt");
        String lines;
        String[] tokens;


        try(Scanner in = new Scanner(fd)){
            while (in.hasNextLine()){
                lines = in.nextLine();
                tokens = lines.split("\\s-");

                for(String token : tokens){
                    System.out.println(token.trim()+ " ");
                }
                System.out.println();
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Thanks for using my app");
    }
}
