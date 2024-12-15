package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {

        int postivesCount = 0;
        Scanner in = new Scanner(System.in) ;
        int inputNum = 0;

        System.out.println("Please insert a num");

        while ((inputNum = in.nextInt()) >= 0) {
            postivesCount++;
            System.out.println("please insert a num");
            inputNum = in.nextInt();
        }

        System.out.println("PositivesCount: " + postivesCount);
    }
}
