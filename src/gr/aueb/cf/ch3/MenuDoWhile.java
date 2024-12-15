package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice ;

        do {
            System.out.println("1.insert");
            System.out.println("2.Delete");
            System.out.println("3.quit");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the Menu App");


    }
}
