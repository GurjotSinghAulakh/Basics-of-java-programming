package arv;

/**
 * It extends the Person class, and adds a study direction and a student number
 */
public class Student extends Person{
    private String studieretning;
    private int studentnr;

    public Student(String navn, int alder, String email, String studieretning, int studentnr) {
        super(navn, alder, email);
        this.studieretning = studieretning;
        this.studentnr = studentnr;
    }

    public String getStudieretning() {
        return studieretning;
    }

    public void setStudieretning(String studieretning) {
        this.studieretning = studieretning;
    }

    public int getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
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
     * The function overrides the toString() function from the Person class, and adds the studentnr and
     * studieretning variables to the string
     * 
     * @return The toString method is being returned.
     */
    @Override
    public String toString() {
        return "Student: \n" + super.toString() + ", Studieretning: " + studieretning + ", Studentnr: " + studentnr + "\n";
    }
    
}
