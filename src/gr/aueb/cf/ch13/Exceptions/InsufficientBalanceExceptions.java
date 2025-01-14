package gr.aueb.cf.ch13.Exceptions;

public class InsufficientBalanceExceptions extends Exception{
    public InsufficientBalanceExceptions(double balance , double amount){
        super("Insufficient balance " + balance + " for amount " + amount);
    }
}
