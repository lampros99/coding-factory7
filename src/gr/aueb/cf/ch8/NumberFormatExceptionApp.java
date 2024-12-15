package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String str = " ";

        System.out.println("Please insert an int");
        str = in.nextLine();

        if(!inInt(str)){
            System.out.println("Error pin parsing");
            System.exit(1);
        }

        num = Integer.parseInt(str);

        System.out.println(num);
    }

    public static boolean inInt(String s){

        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
