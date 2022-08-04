package kontrollstrukturer2;

public class Oppgave8 {
    public static void main(String[] args) {

        int sum = 0;
        int teller = 0;
        int i = 0;

        // Adding all the even numbers from 0 to 100.
        while (i < 100){
            sum += i;
            teller++;
            i+=2;
        }

        // Casting the variables to double, so that the result is a double.
        double snitt = (double) sum / (double) teller;

        // It prints out the text "Gjennomsnittet blir" and the value of the variable `snitt`.
        System.out.println("Gjennomsnittet blir " + snitt);
    }
}
