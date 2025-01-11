package ru.denisov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label R1Label;

    @FXML
    private Label R2Label;

    @FXML
    private Label aLabel;

    @FXML
    private Button btnButton;

    @FXML
    private TextField nTextField;

    @FXML
    private Label sLabel;

    @FXML
    private TextField zTextField;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText().toString());
        double z = Double.parseDouble(zTextField.getText().toString());
        double a, R1, R2, s;
        switch (n) {
            case 1: a = z; break;
            case 2: R1 = z; a = (4 * R1) / Math.sqrt(3); break;
            case 3: R2 = z; R1 = R2 / 2; a = (4 * R1) / Math.sqrt(3); break;
            case 4: s = z; a = Math.sqrt((4 * s) / Math.sqrt(3)); break;
            default: return; // Неверный номер
        }
        R1 = a * Math.sqrt(3) / 4;
        R2 = 2 * R1;
        s = (a * a * Math.sqrt(3)) / 4;
        aLabel.setText(String.format("a: %.2f", a));
        R1Label.setText(String.format("R1: %.2f", R1));
        R2Label.setText(String.format("R2: %.2f", R2));
        sLabel.setText(String.format("S: %.2f", s));

    }

}
