package gr.aueb.cf.ch2;

/*
 * x = 10
 * Y = 85
 * D = 30
 */

public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //calculate jumps

        //jumps =(start + hop) * 2 + 5;

        jumps = (int) Math.ceil((target - start) / (double) hop);


        System.out.println("Jumps: " + jumps);

    }
}
