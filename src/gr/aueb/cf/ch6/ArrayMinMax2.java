package gr.aueb.cf.ch6;

public class ArrayMinMax2 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 22, 19};
        int minPosition;
        int maxPosition;
        minPosition = getMinPosition(arr);
        maxPosition = getMaxPosition(arr);


        System.out.println("H θεση του ελαχιστου ψηφιου ειναι: " + minPosition);
        System.out.println("Η θεση του μεγαλυτερου ψηφιου ειναι: " + maxPosition);


    }

    public static int getMinPosition(int[] arr) {
        if(arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return  minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if(arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return  maxPosition;
    }
}
