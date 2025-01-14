package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.Exceptions.InsufficientBalanceExceptions;
import gr.aueb.cf.ch13.Exceptions.NegativeAmountException;
import gr.aueb.cf.ch13.Exceptions.SsnNotValidException;

/**
 * Difanes a {@link Account} class.
 * @author Lampros
 * @version 0.1
 * @since 0.1
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private static double balance;


    public Account(){

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Public API
     */

    /**
     * Deposits a certain amount of money.
     *
     * @param amount           the amount of money to be deposited.
     * @throws Exception        if the amount is negative.
     */
    public static void deposit(double amount) throws NegativeAmountException {
        try {
            if(amount < 0){
                throw new NegativeAmountException(amount);
            }

            balance += amount;
            System.out.println("Ammount " + amount + " successfully deposited"); //logging

        }catch (NegativeAmountException e){
            System.err.println("Error. Amount " + amount + " can not be negative");
          //  e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount of monay from the {@link  Account}
     * based on a valid ssn checked by {@link Account#isSsnValid(String)}
     * @param amount
     *           the amount to be widthdrawn.
     * @param ssn
     *         the given ssn.
     * @throws Exception
     *       if the ssn is not valid or the balance is not sufficient or
     *       the amount is negative.
     */
    public void widthdraw(double amount, String ssn)
            throws SsnNotValidException, InsufficientBalanceExceptions, NegativeAmountException{
        try {
            if (!isSsnValid(ssn)){
//                throw  new Exception("Ssn " + ssn + " is not valid." );
                throw new SsnNotValidException(ssn);
            }
            if(amount > balance) {
//                throw new Exception("Insufficient balance " + balance + " for amount " + amount);
                throw new InsufficientBalanceExceptions(balance, amount);
            }
            if(amount < 0){
//                throw new Exception("The amount must not be negative.");
                throw new NegativeAmountException(amount);
            }
            balance -= amount;
            System.out.println("Ammount " + amount + " succesfully widthdraw"); //logging
        }catch (SsnNotValidException | InsufficientBalanceExceptions | NegativeAmountException e){
            System.err.println("Error ." + e.getMessage());
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}.
     * @return the account's balance.
     */
    public double getAccountBalance(){
        System.out.println("the account balance was returned"); //logging
        return getBalance();
    }

    public String accountToString(){
        return '(' + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }
}
