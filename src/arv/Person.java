package arv;

/**
 * It's a class that represents a person, and it has a method that returns the school the person is
 * attending
 */
public abstract class Person {
    private String navn;
    private int alder;
    private String email;

    public Person(String navn, int alder, String email) {
        this.navn = navn;
        this.alder = alder;
        this.email = email;
    }

    abstract String getSkole();
    abstract void skrivSkole();

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * It returns a string representation of the object
     * 
     * @return The method returns a string with the name, age and email of the person.
     */
    @Override
    public String toString() {
        return "Navn: " + navn + ", Alder: " + alder + ", Email: " + email;
    }
}

