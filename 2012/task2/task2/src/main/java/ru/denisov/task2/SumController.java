package ru.denisov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button btnButton;

    @FXML
    private TextField resultLabel;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTextField.getText().toString());
        int b = Integer.parseInt(bTextField.getText().toString());
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        resultLabel.setText(String.valueOf(count));
    }

}
