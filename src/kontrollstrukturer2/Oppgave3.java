package kontrollstrukturer2;

public class Oppgave3 {
    public static void main(String[] args) {

        /********************************** Alternative 1: **********************************************/

        // Printing out all even numbers from 0 to 20.
        for (int i = 0; i < 20; i += 2) {
            System.out.print(i + " ");
        }

        // It prints out a new line.
        System.out.println();

        /********************************** Alternative 2: **********************************************/

        // It prints out all even numbers from 0 to 20.
        for (int i = 0; i < 20; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
