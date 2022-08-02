package diverse;

/**
 * It's a class that represents an employee
 */
public class Ansatt {
    private String navn; 
    private Dato fodt;
    private Dato tiltrodt;

    public Ansatt(String navn, Dato fodt, Dato tiltrodt) {
        this.navn = navn;
        this.fodt = fodt;
        this.tiltrodt = tiltrodt;
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return The method returns a string with the name, birthdate and date of employment of the employee.
     */
    @Override
    public String toString() {
        return "Ansatt:" + navn + " er født " + fodt + "og tiltrådte " + tiltrodt;
    }
}


