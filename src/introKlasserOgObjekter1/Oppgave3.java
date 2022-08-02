package introklasserogobjekter1;

public class Oppgave3 {
    public static void main(String[] args) {
        
        // Creating a new instance of the class Person.
        Person enPerson = new Person();

        // Setting the values of the variables in the class Person.
        enPerson.navn = "Ole Olsen";
        enPerson.telefonnr = 42;
        enPerson.adresse = "Askerveien 30";
        enPerson.fodselsar = 1999;

        // Calling the method `finnAlder()` from the class `Person` and storing the value in the
        // variable `alder`.
        int alder = enPerson.finnAlder();

        // Calling the method `skrivUtOppgave3()` from the class `Person` and passing the
        // variable `alder` as an argument.
        enPerson.skrivUtOppgave3(alder);
    }
}
