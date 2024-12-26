package ru.denisov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private Label chasnoeLabel;

    @FXML
    private TextField kTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label ostatokLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        int k = Integer.parseInt(kTextField.getText().toString());
        int quotient = 0;
        int remainder = n;
        while (remainder >= k) {
            remainder -= k;
            quotient++;
        }
        chasnoeLabel.setText(" "+ quotient);
        ostatokLabel.setText(" " + remainder);
    }

}
