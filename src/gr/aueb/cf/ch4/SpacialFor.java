package gr.aueb.cf.ch4;

public class SpacialFor {
    public static void main(String[] args) {
       int count = 0;

        for (int i = 1; i <= 1; i++) {
            System.out.println("Once");
        }

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + ", " + j);
        }

        for (;;) {
            System.out.println("for Even");
            count++;
            if (count == 10) break;
        }
    }
}
