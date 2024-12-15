package gr.aueb.cf.ch2;
// Demonstrate
public class ExprApp {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 20;
        int sum = 0;
        int result = 0;

        sum = num1 + num2;
        result = sum++;

        result += 10;
        result *= 10;
        result -= 10;
        result /= 10;
        result %= 10;
        result = result + 1;


    }
}
