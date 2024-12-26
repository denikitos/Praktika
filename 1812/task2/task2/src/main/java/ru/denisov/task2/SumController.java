package ru.denisov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(NTextField.getText().toString());
        if (number > 0) {
            number -= 8;
        } else if (number < 0) {
            number += 6;
        } else {
            number = 10;
        }
        resLabel.setText("Результат: " + number);
    }
}



