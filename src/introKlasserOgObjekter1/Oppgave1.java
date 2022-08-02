package introklasserogobjekter1;

public class Oppgave1 {
    public static void main(String[] args) {

        // It creates a new object of the class Bok.
        Bok enBok = new Bok();


        // Assigning values to the variables in the class Bok.
        enBok.tittel = "Java for dummies";
        enBok.pris = 599.0;
        enBok.forfatter = "John Doe";
        enBok.isbn = "9788254800";


        // Calling the method `skrivUtOppgave1()` from the class `Bok`.
        enBok.skrivUtOppgave1();
    }
}
