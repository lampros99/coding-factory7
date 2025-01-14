package gr.aueb.cf.ch13;

public class main {
    public static void main(String[] args) {
        Account account = new Account(1, "GR242", "Alice", "Wondeland", "S123", 1000.0);
        try {
            Account.deposit(900);
            System.out.println("The deposit was successful.");

            account.widthdraw(500,"R123");


            account.widthdraw(200,"S123");
            System.out.println("The withdraw was successful");
            System.out.println("Balance: " + account.getAccountBalance());

            System.out.print(account.accountToString());
        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
}
