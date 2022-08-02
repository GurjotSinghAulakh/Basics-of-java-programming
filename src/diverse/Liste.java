package diverse;

public class Liste {
    
    /**
     * It counts the number of positive integers in a list
     * 
     * @param liste The array to be checked
     * @return The number of elements in the array that are greater than 0.
     */

    public static int storreEnnNull(int[] liste) {
        int teller = 0;
        for (int i : liste) {
            if (i > 0) {
                teller++;
            }
        }
        return teller;
    }

    /**
     * It counts the number of times a given number appears in an array
     * 
     * @param liste The array to be searched
     * @param tallet The number you want to find the occurrences of.
     * @return The number of times the number is in the array.
     */

    public static int forekomster(int[] liste, int tallet) {
        int teller = 0;
        for (int i : liste) {
            if (i == tallet) {
                teller++;
            }
        }
        return teller;
    }

    /**
     * Find the largest number in the list and return it.
     * 
     * @param liste The array to be searched
     * @return The largest number in the array.
     */

    public static int storst(int[] liste) {
        int storst = liste[0];

        for (int i : liste) {
            if (i > storst) {
                storst  = i;
            }
        }

        return storst;
    }
}
