package gr.aueb.cf.ch2;

public class TypeCastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;

        num2 = (int) num1;   //typeCast σε long --> int

        System.out.println(num2);
    }

}
