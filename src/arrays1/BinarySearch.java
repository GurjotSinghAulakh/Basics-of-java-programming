package arrays1;

import static javax.swing.JOptionPane.showInputDialog;


/**
 * The function takes a number to search for. It then uses a binary search
 * algorithm to find the number in the array. The while loop will keep running 
 * until the low index is greater than the high index
 */

public class BinarySearch {
    public static void main(String[] args) {

        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                        41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}; 
        

        int search = Integer.parseInt(showInputDialog("Enter a number"));
        
        int low = 0;
        int high = primeNumbers.length - 1;
        int mid = (low + high) / 2;
        
        while (low <= high) {
            if (primeNumbers[mid] == search) {
                System.out.println("Found at index: " + mid);
                break;
            }

            else if (primeNumbers[mid] < search) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

            mid = (low + high) / 2;
        }
        
        if (low > high) {
            System.out.println("Not found");
        }
    }


}
