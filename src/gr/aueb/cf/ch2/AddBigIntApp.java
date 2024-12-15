package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger Num1 = new BigInteger("134141414131");
        BigInteger Num2 = new BigInteger("4141414141414");
        BigInteger result = Num1.add(Num2); // to .add δινει την δυνατοτητα να γινει η προσθεση.

        System.out.printf("%,d",result );
    }
}
