package javaFXgrafiskbrukergrensesnitt;

/*
  * NB! Use jdk 1.8 (version 8 of java)
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField txtBelop;

    @FXML
    private TextField txtRente;

    @FXML
    private TextField txtAntallAar;

    @FXML
    private Label lblResultat;

    @FXML
    private void beregn(ActionEvent event) {
        // Trying to parse the text in the textfields to double and int.
        try{
            double belop = Double.parseDouble(txtBelop.getText());
            double rente = Double.parseDouble(txtRente.getText());
            int antallAr = Integer.parseInt(txtAntallAr.getText());

            // Calculating the total amount of money after a certain amount of years.
            double resultat = belop * Math.pow(1+(rente/100), antallAr);

            // Setting the text of the label to the result of the calculation.
            lblResultat.setText("Totalbeløpet etter " + antallAr + " år blir " + String.format("%.2f", resultat) + "kr.");
        } 
        
        // It catches the exception if the user doesn't write a number in the textfields.
        catch(Exception e){
            lblResultat.setText("Skriv inn tall i alle feltene!");
        }
    }
}
