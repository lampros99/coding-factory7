package gr.aueb.cf.ch6;

/**
 * Αντικαθηστα ενα στοιχειο του πινακα.
 * Με ενα αλλο.
 */

public class ReplaceElement {
    public static void main(String[] args) {

    }


    public static void replace(int[] arr, int oldVal, int newval) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newval;
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
