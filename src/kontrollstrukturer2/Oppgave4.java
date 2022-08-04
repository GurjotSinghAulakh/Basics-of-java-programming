package kontrollstrukturer2;

public class Oppgave4 {
    public static void main(String[] args) {

        int sum = 0;
        int teller = 0;

        // Adding all the even numbers from 0 to 100.
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                sum += i;
                teller++;
            }
        }

        // Casting the ints to doubles.
        double snitt = (double) sum / (double) teller;

        // Printing out the average of the even numbers from 0 to 100.
        System.out.println("Gjennomsnittet blir: " + snitt);
    }
}
