package arv;

/**
 * Ansatt extends Person, and adds a fagfelt and ansattnr
 */
public class Ansatt extends Person{
    private String fagfelt;
    private int ansattnr;
   

    public Ansatt(String navn, int alder, String email, String fagfelt, int ansattnr){
        super(navn, alder, email);
        this.fagfelt = fagfelt;
        this.ansattnr = ansattnr;
    }

    public String getFagfelt() {
        return fagfelt;
    }

    public void setFagfelt(String fagfelt) {
        this.fagfelt = fagfelt;
    }

    public int getAnsattnr() {
        return ansattnr;
    }

    public void setAnsattnr(int ansattnr) {
        this.ansattnr = ansattnr;
    }

    /**
     * It returns the string "OsloMet"
     * 
     * @return "OsloMet"
     */
    @Override
    String getSkole() {
        return "OsloMet";
    }

    /**
     * The function `skrivSkole()` prints the school of the student
     */
    @Override
    public void skrivSkole() {
        System.out.println("Skole: " + getSkole());
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The toString method is being returned.
     */
    @Override
    public String toString() {
        return "Ansatt: \n" + super.toString() + ", Fagfelt: " + fagfelt + ", Ansattnr: " + ansattnr + "\n";
    }
}



