package arrays1;

/**
 * It compares two arrays and prints out whether they are equal or not
 */ 

public class Oppgave6 {
    public static void main(String[] args) {
        int[] numbers1 = {45, 34, 5, 8, 10, 2, 13, 25}; 
        int[] numbers2 = {45, 34, 5, 8, 10, 2, 13, 25}; 
        
        boolean equal = true;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] != numbers2[i]) {
                equal = false;
            }
        }

        if (equal) {
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
