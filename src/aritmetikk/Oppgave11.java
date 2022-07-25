
package aritmetikk;

import javax.swing.*;

/**
 * It takes an input number, and then calculates the sum of the three digits in the number
 */ 

public class Oppgave11 {
    public static void main(String[] args) {
        int inputNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        int num1, num2, num3;

        // --> 7,51 = 7
        num1 = inputNum / 100;    
        
        // --> (51) / 10 = 5,1 = 5
        num2 = (inputNum % 100) / 10; 

        // --> (51) % 10 = 1
        num3 = inputNum % 10;         

        int crossSum = num1 + num2 + num3;

        System.out.println("Cross sum of " + inputNum + " is " + crossSum);

    }
}