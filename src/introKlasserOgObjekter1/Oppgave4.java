package introklasserogobjekter1;

import javax.swing.JOptionPane;

public class Oppgave4 {
    public static void main(String[] args) {
        
        // It's creating a new instance of the class `Person` and assigning it to the variable
        // `enPerson`.
        Person enPerson = new Person();

        // It's assigning the value returned by the method `JOptionPane.showInputDialog` to the
        // variable `navn` in the class `Person`.
        enPerson.navn = JOptionPane.showInputDialog("Navn: ");
        enPerson.telefonnr = Integer.parseInt(JOptionPane.showInputDialog("Telefonnummer: "));
        enPerson.adresse = JOptionPane.showInputDialog("Adresse: ");
        enPerson.fodselsar = Integer.parseInt(JOptionPane.showInputDialog("Fødselsår: "));

        // It's calling the method `finnAlder` in the class `Person` and assigning the return value to
        // the variable `alder`.
        int alder = enPerson.finnAlder();

        // It's calling the method `skrivUtOppgave4` in the class `Person` and passing the variable
        // `alder` as an argument.
        enPerson.skrivUtOppgave4(alder);
    }
}
