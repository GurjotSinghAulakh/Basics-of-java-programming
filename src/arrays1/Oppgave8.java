package arrays1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * It reads in a number of integers, and then prints out the average of those integers
 */ 

public class Oppgave8 {
    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        int sum = 0;
        int count = 0;
        int average = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            String input = showInputDialog("Enter a number");
            numbers[i] = Integer.parseInt(input);
            sum += numbers[i];
            count++;
        }

        average = sum / count;
        
        showMessageDialog(null, "Average: " + average);
    }
}