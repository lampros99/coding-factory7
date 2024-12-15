package gr.aueb.cf.ch10;

import java.util.Scanner;

public class SimpleBank {
    static  double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            deposit(100);
        }catch (Exception e){
            System.out.println("An error happened. Try again...");
        }
    }

    public static void deposit(double amount) throws Exception{
        try{
            if (amount <= 0) {
                throw new Exception("Error.Amount: " + amount + " must not be negative or zero");
            }
            balance += amount; // balance = balance + amount;
            System.out.println("Successfully deposited: " + amount);
        }catch (Exception e){
            System.err.print("Error. " + e.getMessage());
        }
    }

    public static void widthdraw(double amount) throws Exception{
        try {
            if(amount <= 0){
                throw new Exception("Error. Amount: " + amount + " must not be negative or zero");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Error. Amount: " + amount + " is greater than balance.");
            }
            balance -= amount;
        }catch (Exception e){
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
}
