package arrays1;

/**
 * It counts the number of even and odd numbers in an array
 */

public class Oppgave7 {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25}; 
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}