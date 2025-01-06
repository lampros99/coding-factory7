package gr.aueb.cf.ch3;
// Δικαίωμα ψήφου > 18

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Eligible = true;
        final int VOTING_AGE = 18;
        int age = 0;

        System.out.println("please insert your age");
         age = scanner.nextInt();

        Eligible = age >= 18;
        System.out.println("you are Eligible " + Eligible);





    }
}
