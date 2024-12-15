package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        System.out.println("Please insert a numerator");
        while(!in.hasNextInt()){
            System.out.println("Error please insert a number");
            in.nextLine();
        }
        numerator = in.nextInt();


        System.out.println("Please insert a denominator");
        while (!in.hasNextInt()){
            System.out.println("Error please insert a number");
            in.nextLine();
        }

        denominator = in.nextInt();

        result = numerator / denominator;


        if(denominator == 0){
            System.out.println("Error please cannot to use zero");
            System.exit(1);
        }

        System.out.printf("%d / %d = %d", numerator, denominator, result);
    }
}
