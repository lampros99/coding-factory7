package gr.aueb.cf.ch6;

/**
 *  εδω υπαρχουν δυο παραδειγματα για το αν
 *  ενας πινακας ειναι σημετρικος π.χ [1, 2, 3, 2, 1]
 */
public class SummetricApp {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymmetric = true;

        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if(arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return  isSymmetric;
    }
    //Εναλακτικη λυση.

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymetric = true;
        int n = arr.length -1;

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n-i]) {
                isSymetric = false;
            }
        }

        return  isSymetric;

    }
}
