package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1, 22, 31, 8, 9, 10};
    }

    // Filtering
    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0)
                evens[pivot++] = el;
        }
        return evens;
    }

    //Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    //reducing

    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            el += sum;
        }
        return sum;
    }

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length -2; i++){
            if(arr[i] == arr[i + 1] - 1 && arr[i] == arr[i+2] -2){
                count++;
                break;
            }
        }

        return count >= 1;

    }

    // Βλεπει αν εχει τον ιδιο ολιγοντα.
    public static boolean moreThanTwoWithSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for(int num : arr){
            endings[num % 10]++;
        }

        for(int count : endings){
            if(count >= 3) {
                isSameEnding  = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr){
        boolean allEven = false;
        int count = 0;

        for(int el : arr){
            if(el % 2 == 0)count++;
        }
        return count == arr.length;
    }

    public static boolean allAreEvens(int[] arr){
        boolean allisEvens = false;
        int count = 0;

        for(int el : arr){
            if(el % 2 == 0)
                count++;
        }

        return count == arr.length;
    }
}
