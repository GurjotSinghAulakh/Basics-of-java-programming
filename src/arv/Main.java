package arv;

import java.util.ArrayList;

/**
 * It creates a list of persons, adds a student and an employee to the list, and then prints out the
 * school for each person in the list
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personer = new ArrayList<>();

        Person student = new Student("Per", 25, "per@hansen.no", "IT", 12345);
        Person ansatt = new Ansatt("Kari", 30, "kari@jensen.no", "Sykepleie", 654321);

        personer.add(student);
        personer.add(ansatt);

        for (Person p : personer) {
            p.skrivSkole();
            System.out.println(p);
        }
    }
    
}
