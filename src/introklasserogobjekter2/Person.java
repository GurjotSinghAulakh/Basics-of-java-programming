package introklasserogobjekter2 ;

import static javax.swing.JOptionPane.showMessageDialog;

public class Person {
    
    // Declaring the variables.
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    // A constructor.
    public Person(String fornavn, String etternavn, String adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    /**
     * It prints out the name, address and phone number of the person
     */
    
    public void skrivUt(){
        String utskrift = "Navn : " + this.fornavn + " " + this.etternavn + "\n" +
                "Adresse : " + this.adresse + "\n" +
                "Telefonnr : " + this.telefonnr + "\n";

        showMessageDialog(null, utskrift);
    }
}
