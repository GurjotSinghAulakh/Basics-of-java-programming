package grensesnitt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // It creates a new ArrayList of type Person.
        ArrayList<Person> personer = new ArrayList<>();

        // It creates two new objects of type Person, one of type Student and one of type Ansatt.
        Person student = new Student("Fredrik");
        Person ansatt = new Ansatt("Kari");

       // It adds the objects to the ArrayList.
        personer.add(student);
        personer.add(ansatt);

        // A for-each loop. It iterates through the ArrayList and prints out the objects.
        for (Person person : personer) {
            System.out.println(person);
        }
    }
}
