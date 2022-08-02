package grensesnitt;

/**
 * A Student is a Person with a name
 */

public class Student implements Person{
    
    // Declaring a variable.
    private String navn;

    // A constructor.
    public Student(String navn) {
        this.navn = navn;
    }

    // A constructor.
    public Student() { }

    /**
     * This function returns the name of the person
     * 
     * @return The name of the person.
     */

    @Override
    public String getnavn() {
        return navn;
    }

    /**
     * The function setnavn() sets the name of the person
     * 
     * @param navn The name of the item.
     */

    @Override
    public void setnavn(String navn) {
        this.navn = navn;
    }

    /**
     * It returns a string representation of the object
     * 
     * @return The toString method is being returned.
     */
    @Override
    public String toString() {
        return "Student med navn " + navn;
    }
}
