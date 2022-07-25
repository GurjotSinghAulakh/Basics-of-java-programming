package aritmetikk;

import javax.swing.*;

/**
 * It asks the user for the number of people, the number of pizzas and the number of slices per pizza.
 * Then it calculates how many slices each person gets and how many slices are left over
 */ 

public class Oppgave7 {
    public static void main(String[] args) {
        int people = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of people"));
        int pizzas = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pizzas"));
        int slices = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of slices per pizza"));
        
        int slicesPerPerson = pizzas * slices / people;
        int slicesLeftOver = pizzas * slices % people;
        
        String output = "Each person gets " + slicesPerPerson + " slices, and there are " + slicesLeftOver + 
                        " slices left over";
        
        JOptionPane.showMessageDialog(null, output);
    }

}
