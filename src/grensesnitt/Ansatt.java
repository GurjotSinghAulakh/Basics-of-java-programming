package grensesnitt;

/**
 * It's a class that implements the Person interface
 */

public class Ansatt implements Person {

    // It's a private variable that is only accessible within the class.
    private String navn;

    // It's a constructor that takes a String as a parameter and sets the private variable navn to the
    // value of the parameter.
    public Ansatt(String navn) {
        this.navn = navn;
    }

    // It's a constructor that takes no parameters.
    public Ansatt() { }

    /**
     * It returns the name of the person
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
     * The `toString()` method is a special method that is called when you try to print an object
     * 
     * @return The name of the employee.
     */
    
    @Override
    public String toString() {
        return "Ansatt med navn " + navn;
    }
}
