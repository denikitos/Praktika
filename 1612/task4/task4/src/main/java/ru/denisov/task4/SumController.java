package ru.denisov.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField gTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField zTextField;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double g = Double.parseDouble(gTextField.getText().toString());
        double y = x + Math.sqrt(Math.abs(1 - x * x));
        double z = Math.pow(Math.sin(2 * (x + g)), 2) + (Math.cos(x) / (x + Math.pow(y, 2) * Math.log(Math.abs(x - y))));
        resLabel.setText("z = " + z);
    }

}
