package gr.aueb.cf.ch6;

/**
 *
 */

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] πινακας = {1, 2, 3, 4, 5};
        int[] αντιγραφα;

        αντιγραφα = arrDeepCopy(πινακας);

    }

    /**
     *
     *it creates a fresh-copy (deep copy) of an array.
     * @param source    the source array.
     * @return          the copied array.
     */

    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
//
//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        Arrays.copyOfRange(source, 0, source.length);

        return destination;

    }
}
