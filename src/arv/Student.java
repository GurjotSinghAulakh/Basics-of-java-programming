package arv;

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

    @Override
    String getSkole() {
        return "OsloMet";
    }

    @Override
    public void skrivSkole() {
        System.out.println("Skole: " + getSkole());
    }

    @Override
    public String toString() {
        return "Student: \n" + super.toString() + ", Studieretning: " + studieretning + ", Studentnr: " + studentnr + "\n";
    }
    
}
