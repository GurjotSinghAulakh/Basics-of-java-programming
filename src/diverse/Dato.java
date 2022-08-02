package diverse;

/**
 * It's a class that represents a date
 */
public class Dato {
    private final int dag;
    private final int maned;
    private final int ar;

    // It's a constructor.
    public Dato(int dag, int maned, int ar) {
        this.dag = dag;
        this.maned = maned;
        this.ar = ar;
    }

    /**
     * If the month number is between 1 and 12, return the name of the month, otherwise return "ukjent"
     * 
     * @param mnd The month number (1-12)
     * @return The name of the month.
     */
    
    private static String manedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", 
                        "oktober", "november", "desember"};
        
        if (mnd > 0 && mnd < 13) {
            return navn[mnd - 1];
        } else {
            return "ukjent";
        }
    }

    /**
     * It returns a string that contains the day, month, and year of the date
     * 
     * @return The day, month and year.
     */
    public String toString() {
        return dag + " " + manedsnavn(maned) + " " + ar;
    }
}

