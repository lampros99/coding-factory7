package gr.aueb.cf.ch13.Exceptions;

public class SsnNotValidException extends Exception{
    public SsnNotValidException(String ssn){
        super("Ssn " + ssn + " is not valid.");
    }
}
