package aritmetikk;

import javax.swing.*;

/**
 * If the user is 18 or older, the program prints out that the user is old enough to get a driver's
 * license. If the user is younger than 18, the program prints out that the user is not old enough to
 * get a driver's license
 */

 public class Oppgave10 {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are old enough to get a driver's license");

        } else {
            JOptionPane.showMessageDialog(null, "You are not old enough to get a driver's license");
        }
    }
}
