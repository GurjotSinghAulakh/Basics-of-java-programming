package grensesnitt;

// Defining an interface.
public interface Person {

    /**
     * It returns the name of the person.
     * 
     * @return The name of the object.
     */
    String getnavn();
    
    /**
     * This function takes a String as input and returns nothing.
     * 
     * @param navn The name of the variable you want to set.
     */
    void setnavn(String navn);
}