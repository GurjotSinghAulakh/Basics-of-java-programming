// package diverse;

// import javafx.fxml.FXML;

// import java.awt.*;

// public class Controller {

//     // It creates a new Lotteri object.
//     private Lotteri lotteri = new Lotteri();

//     @// A variable that is used to store the text that the user inputs into the text fields.
//     FXML
//     private Label lblResultater;

//     // A variable that is used to store the text that the user inputs into the text fields.
//     @FXML
//     private TextField txtNavn, txtTelefonnr;

//     /**
//      * It creates a new Lodd object, sets its name and phone number, and then calls the Lotteri object's
//      * kjopLodd method
//      */
//     @FXML
//     public void regLoddslag() {
//         Lodd lodd = new Lodd();
//         lodd.navn = txtNavn.getText();
//         lodd.telefonnr = txtTelefonnr.getText();

//         boolean kjoplodd = lotteri.kjopLodd(lodd);

//         if(!kjopLodd) {
//             lblResultater.setText("Det er ikke mulig å kjøpe flere lodd.");
//         } else {
//             lblResultater.setText("Du har kjopt lodd");
//         }
//     }
    
//     /**
//      * The function `foretaTrekning()` is called when the button `btnTrekk` is pressed
//     */
//     @FXML
//     public void foretaTrekning() {
//         lblResultater.setText(lotteri.trekkVinner());
//     }

//     /**
//      * When the user clicks the button, create a new Lotteri object.
//      */
//     @FXML
//     public void nyttLotteri() {
//         lotteri = new Lotteri();
//     }

// }
