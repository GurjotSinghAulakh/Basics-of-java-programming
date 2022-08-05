package kontrollstrukturer2.andreOppgaver;

public class Oppgave6 {
    public static void main(String[] args) {
        String utskrift = "N\N^2\tN^3\tN^4\n";

        // A for loop that runs 10 times.
        // The loop will print out the values of the variables `n` and `n^2`, `n^3` and `n^4`.
        for (int n = 1; i <= 10; n++) {
            utskrift += n + "\t" + Math.pow(n, 2) + "\t";
            utskrift += Math.pow(n, 3) + "\t" + Math.pow(n, 4) + "\n";
        }

        System.out.println(utskrift);
    }
}
