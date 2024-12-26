package ru.denisov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField KTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int FileSize = Integer.parseInt(KTextField.getText().toString());
        float kiloBytes = FileSize / 1024;
        resLabel.setText(" " + String.format("%.3f",kiloBytes));
    }

}
