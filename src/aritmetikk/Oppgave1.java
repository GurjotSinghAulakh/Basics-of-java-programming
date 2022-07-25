package aritmetikk;

import javax.swing.*;

/**
 * It asks the user for their name and age, then calculates the year they were born and the year they
 * will become a pensioner
 */

public class Oppgave1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hva heter du?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Hvor gammel er du?"));

        int yearOfBirth = 2022 - age;
        int yearOfPension = yearOfBirth + 67;

        String output = "Du heter " + name + " og du ble født i " + yearOfBirth + " og du vil få pension i " + yearOfPension;

        JOptionPane.showMessageDialog(null, output);
    }
}
