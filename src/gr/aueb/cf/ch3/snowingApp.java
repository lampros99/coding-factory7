package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
 * snowing if raining And temp < 0
 */
public class snowingApp {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;

        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.println("please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Plsease insert the temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("is snowing: " + isSnowing);


    }
}
