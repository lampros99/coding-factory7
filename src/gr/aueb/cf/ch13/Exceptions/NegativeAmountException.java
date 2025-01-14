package gr.aueb.cf.ch13.Exceptions;

public class NegativeAmountException extends Exception{
    public NegativeAmountException(double amount){
        super("Amount " + amount + " is sufficient.");
    }
}
