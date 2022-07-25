package arrays1;

/**
 * It sums up the numbers in an array, and then calculates the average of the numbers in the array
 */ 

 public class Oppgave2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);
    }
}