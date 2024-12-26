package ru.denisov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText().toString());
        double b = Double.parseDouble(bTextField.getText().toString());
        double square = a * b;
        double Perimeter = 2 * (a + b);
        resLabel.setText("" + square);
        resLabel.setText("" + Perimeter);
    }

}
