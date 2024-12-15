package gr.aueb.cf.ch6;

/**
 * Είναι μια αναδρομική υλοποίηση της δυαδικής αναζήτησης.
 * Η δυαδική αναζήτηση έχει χρόνο εκτέλεσης O(log n)
 * καθώς κάθε βήμα μειώνει το μέγεθος του υποπίνακα στο μισό.
 */
public class BinarySearch {
    public static void main(String[] args) {

    }



    /**
     * Αναδρομική μέθοδος για δυαδική αναζήτηση σε έναν ταξινομημένο πίνακα.
     *
     * @param arr   Ο πίνακας στον οποίο ψάχνουμε
     * @param value Η τιμή που αναζητούμε
     * @param low   Το κάτω όριο του τμήματος του πίνακα που ψάχνουμε
     * @param hight Το άνω όριο του τμήματος του πίνακα που ψάχνουμε
     * @return Η θέση της τιμής στον πίνακα (αν βρεθεί), αλλιώς -1
     */
    public static int binarySearch(int[] arr, int value, int low, int hight){
        if(arr == null) return 1;
        if(low < 0 || hight > arr.length -1) return -1;
        if(low > hight) return -1;

        int mid = (low + hight) / 2;

        if(arr[mid] == value) return mid;
        if(value > arr[mid]) {
            return binarySearch(arr, value, mid + 1, hight);
        } else {
            return binarySearch(arr,value,low,mid - 1);
        }
    }
}
