package arrays1;

/**
 * The outer loop iterates through the array, and the inner loop iterates through the array and swaps
 * the elements if the current element is greater than the next element
 */

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 9, 6, 23, 12, 34, 0, 1}; 
        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

