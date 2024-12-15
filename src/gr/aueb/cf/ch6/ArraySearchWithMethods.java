package gr.aueb.cf.ch6;

/**
 * Array search με μεθοδο
 */
public class ArraySearchWithMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int position;

        position = getPosition(arr, 6);

        if (position == - 1) {
            System.out.println("Το στοιχείο δεν βρεθηκε");
        } else {
            System.out.printf("Value: %d, Position: %d", arr[position], (position + 1));
        }


    }

    public static int getPosition(int[] arr, int value) {
        int positionToRutern = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToRutern = i;
                break;
            }
        }

        return positionToRutern;

    }
}
