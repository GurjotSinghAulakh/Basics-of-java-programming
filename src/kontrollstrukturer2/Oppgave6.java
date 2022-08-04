package kontrollstrukturer2;

public class Oppgave6 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // Adding the value of i to sum, and then incrementing i by 1.
        while (i < 10){
            sum += i;
            i++;
        }

        // Printing the value of sum to the console.
        System.out.println("Summen blir: " + sum);
    }
}
