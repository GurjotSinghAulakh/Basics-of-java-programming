package meromklasserogobjekter1;

public class Dato {
    private final int dag;
    private final int mnd;
    private final int aar;


    public Dato(int dag, int mnd, int aar) {
        this.dag = dag;
        this.mnd = mnd;
        this.aar = aar;
    }

    /**
     * If the month number is between 1 and 12, return the name of the month, otherwise return "ugyldig
     * måned"
     * 
     * @param mnd The month number (1-12)
     * @return The name of the month.
     */

    private static String manedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"};
        if (mnd > 0 && mnd < 13) {
            return navn[mnd - 1];
        } else {
            return "ugyldig måned";
        }    
    }

    /**
     * It returns a string that contains the day, month and year of the date
     * 
     * @return The day, month and year.
     */
    
    public String toString() {
        return dag + ". " + manedsnavn(mnd) + " " + aar;
    }
    
}
