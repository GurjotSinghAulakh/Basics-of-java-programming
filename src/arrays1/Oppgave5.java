package arrays1;

/**
 * It creates an array of integers, then loops through the array and compares each integer to the
 * largest and smallest integers found so far
 */ 

 public class Oppgave5 {
    public static void main(String[] args) {
        int[] numbers = {45, 34, 5, 8, 10, 2, 13, 25}; 

        // pretend the first number is the largest
        int largest = numbers[0];

        // pretend the first number is also the smallest
        int smallest = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}