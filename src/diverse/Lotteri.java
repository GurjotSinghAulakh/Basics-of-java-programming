package diverse;

public class Lotteri {
    // A constant that is used to set the length of the array `loddbok`.
    public static final int MAKS_ANTALL = 1000;

    // A variable that keeps track of the number of sold tickets.
    public int antallSolgte = 0;
    
    // Creating an array of type Lodd with the length of MAKS_ANTALL.
    public Lodd[] loddbok = new Lodd[MAKS_ANTALL];

    /**
     * If the array is not full, add the new lottery ticket to the array and increase the number of
     * sold tickets by one
     * 
     * @param nyttLodd The new ticket to be added to the ticket book.
     * @return A boolean value.
     */

    public boolean kjopLodd(Lodd nyttLodd) {
        for (int i = 0; i < loddbok.length; i++) {
            if (loddbok[i] != null) {
                loddbok[i] = nyttLodd;
                antallSolgte++;
                return true;
            }
        }
        return false;
    }

    /**
     * The function `trekkVinner()` returns a string representation of a random lottery ticket from the
     * array `loddbok`
     * 
     * @return The toString() method of the object at index vinner in the array loddbok.
     */

    public String trekkVinner() {
        int vinner = (int) (Math.random() * antallSolgte);
        return loddbok[vinner].toString();
    }
}
