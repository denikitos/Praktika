package ru.denisov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ALabel;

    @FXML
    private Label BLabel;

    @FXML
    private Label CLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Button resButton;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTextField.getText());
        double b = Double.parseDouble(bTextField.getText());
        double c = Double.parseDouble(cTextField.getText());
        if ((a < b && b < c) || (a > b && b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        ALabel.setText("A: " + a);
        BLabel.setText("B: " + b);
        CLabel.setText("C: " + c);
    }

}
