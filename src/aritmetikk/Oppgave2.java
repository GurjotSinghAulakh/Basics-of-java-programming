package aritmetikk;

/**
 * It prints out the numbers 2, 4, 6, and 8
 */

public class Oppgave2 {
    public static void main(String[] args) {
        int antall = 0;
        antall = antall + 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.print(antall + ", ");
        antall += 2;
        System.out.println(antall);

        System.out.println();

        // Alternative:
        for (int i = 2; i < 10; i+= 2){
            System.out.print(i + ", ");
        }
    }
}
