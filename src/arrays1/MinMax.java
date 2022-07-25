package arrays1;

/**
 * It contains two methods, one for finding the largest number in an array, and one for finding the
 * smallest number in an array
 */

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 9, 0, 34, -6, 8}; 
        
        System.out.println("Largest: " + findLargest(numbers));
        System.out.println("Smallest: " + findSmallest(numbers));
    }
    
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}