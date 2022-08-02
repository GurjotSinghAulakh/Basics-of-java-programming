package javaFXoppgaver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Date;

public class Controller {
        
       // Creating a new instance of the class Parkeringshus.
        Parkeringshus parkeringshus = new Parkeringshus();

        @FXML
        // Creating a new instance of the class Label.
        private Label lblAvgift;
    
        @FXML
       // Creating a new instance of the class TextField.
        private TextField txtBilnummer;
    
        @FXML
        // A method that is called when the button "kjør ut" is pressed.
        void kjorUt(ActionEvent event) {

            // Setting the text of the label to the value of the method `frigjorPlass` in the class
            // `Parkeringshus`.
            lblAvgift.setText(parkeringshus.frigjorPlass(txtBilnummer.getText()));
        }
    
        @FXML
        void startKortTid(ActionEvent event) {
            // Creating a new instance of the class Bil.
            // Setting the text of the label to the value of the method `startKortTid` in the class
            Bil enBil = new Bil(txtBilnummer.getText(), new Date(), true);

            // Calling the method `reserverPlass` in the class `Parkeringshus`.
            parkeringshus.reserverPlass(enBil);
        }
    
        @FXML
        void startLangTid(ActionEvent event) {
           // Creating a new instance of the class Bil.
            // Setting the text of the label to the value of the method `startLangTid` in the class
            Bil enBil = new Bil(txtBilnummer.getText(), new Date(), false);

            // Calling the method `reserverPlass` in the class `Parkeringshus`.
            parkeringshus.reserverPlass(enBil);
        }
}
