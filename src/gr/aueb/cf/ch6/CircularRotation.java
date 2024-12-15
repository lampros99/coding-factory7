package gr.aueb.cf.ch6;
/**
 * Η μέθοδος doLeftShift μετατοπίζει τα στοιχεία του πίνακα arr αριστερά κατά offset θέσεις.
 * - Αρχικά, ελέγχει αν ο πίνακας arr είναι null ή αν το offset είναι αρνητικό.
 *   Αν ισχύει κάποια από αυτές τις συνθήκες, επιστρέφει null.
 * - Χρησιμοποιεί το modulo (%) για να εξασφαλίσει ότι η μετατόπιση είναι κυκλική.
 * - Δημιουργεί έναν νέο πίνακα rotated και τοποθετεί κάθε στοιχείο του arr
 *   στη νέα του θέση με βάση τη λογική της αριστερής μετατόπισης.
 *
 * Παράδειγμα:
 * - Αρχικός πίνακας: [1, 2, 3, 4, 5]
 * - offset = 2
 * - Τελικός πίνακας: [3, 4, 5, 1, 2]
 */

public class CircularRotation {
    public static void main(String[] args) {

    }

    public static int[] doLeftShift(int[] arr, int offset){
        if (arr == null) return null;
        if(offset < 0) return null;

        int[] rotated = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static int[] doRightShift(int[] arr, int offset){
        if(arr == null) return null;
        if(offset < 0) return null;

        int[] rotated = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }
}
