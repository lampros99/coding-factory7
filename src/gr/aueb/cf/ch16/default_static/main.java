package gr.aueb.cf.ch16.default_static;

public class main {
    public static void main(String[] args){
       IWelcome.staticMethod();
       CodingWalcome.staticMethod();

       CodingWalcome codingWalcome = new CodingWalcome();
//       codingWalcome.defaultMethod();
    }
}
