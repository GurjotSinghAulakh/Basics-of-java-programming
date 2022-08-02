package introklasserogobjekter2;

import javax.swing.JOptionPane;

public class Konto {

    // Declaring the variables.
    private String navn;
    private String kontonummer; 
    private double saldo;

    // A constructor.
    public Konto(String navn, String kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    /**
     * It prints out the account holder's name, account number and balance
     */

    public void utskrift() {
        String ut = "Kontoinnehaver: \n" +
            "Navn: " + navn + "\n" +
            "Kontonummer: " + kontonummer + "\n" +
            "Saldo: " + String.format("%.2f", saldo) + " kr";
        
        JOptionPane.showMessageDialog(null, ut);
    }

    /**
     * This function takes a double as an argument, adds it to the saldo variable, and returns a string
     * with the new saldo.
     * 
     * @param belop The amount of money to deposit
     * @return The string "Du har lagt inn " + String.format("%.2f", saldo) + " kr"
     */

    public String settInn(double belop) {
        saldo += belop;
        return "Du har lagt inn " + String.format("%.2f", saldo) + " kr";
    }

    /**
     * If the balance is greater than or equal to the amount, subtract the amount from the balance and
     * return a string saying that the amount was withdrawn, otherwise return a string saying that
     * there is not enough money
     * 
     * @param belop The amount of money you want to withdraw
     * @return The method returns a string.
     */
    
    public String taUt(double belop) {
        if (saldo >= belop) {
            saldo -= belop;
            return "Du har tatt ut " + String.format("%.2f", saldo) + " kr";
        } else {
            return "Du har ikke nok penger";
        }
    }
}
