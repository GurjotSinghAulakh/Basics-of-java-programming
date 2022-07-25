package arrays1;

/**
 * It prints out the elements of the array in reverse order
 */

public class Oppgave4 {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25};
        
        for (int i = numbers.length - 1; i >= 0; i--) {

            if (i > 0){
                System.out.print(numbers[i] + ", ");

            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}