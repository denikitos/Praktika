package ru.denisov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextFild;

    @FXML
    private TextField CTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText().toString());
        double b = Double.parseDouble(BTextFild.getText().toString());
        double c = Double.parseDouble(CTextField.getText().toString());
        if (a == 0) {
            resLabel.setText("Уравнение не является квадратным.");
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                resLabel.setText("Два решения.");
            } else if (discriminant == 0) {
                resLabel.setText("Одно решение.");
            } else {
                resLabel.setText("Нет решений.");

            }
        }
    }
}



