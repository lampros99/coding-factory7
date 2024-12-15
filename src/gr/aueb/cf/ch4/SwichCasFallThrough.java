package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwichCasFallThrough {
    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a grade");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("good");
                break;
            case 7:
            case 8:
                System.out.println("very good");
                break;
            case 9:
            case 10:
                System.out.println("Exellent");
                break;
            default:
                System.out.println("Error in grade");
                break;

        }
    }
}
