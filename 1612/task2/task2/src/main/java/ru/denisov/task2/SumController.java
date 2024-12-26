package ru.denisov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField x1TextField;

    @FXML
    private TextField x2TextField;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        double X1 = Double.parseDouble(x1TextField.getText().toString());
        double X2 = Double.parseDouble(x2TextField.getText().toString());
        double Distance = Math.abs(X2 - X1);
        resLabel.setText("" + Distance);

    }

}
