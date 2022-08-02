package introklasserogobjekter1;

public class Oppgave5 {
    public static void main(String[] args) {
        
        // Declaring two variables and assigning them values.
        int tall1 = 5;
        int tall2 = 9;

        // Printing out the result of the calculations.
        System.out.println(tall1 + " + " + tall2 + " = " + Kalkulator.addere(tall1, tall2));
        System.out.println(tall1 + " - " + tall2 + " = " + Kalkulator.subtrahere(tall1, tall2));
        System.out.println(tall1 + " * " + tall2 + " = " + Kalkulator.multiplisere(tall1, tall2));
        System.out.println(tall1 + " / " + tall2 + " = " + Kalkulator.dividere(tall1, tall2));
    }
    
}
