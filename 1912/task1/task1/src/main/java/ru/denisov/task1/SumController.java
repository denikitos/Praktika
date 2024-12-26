package ru.denisov.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField GTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int mes = Integer.parseInt(GTextField.getText());
        String season;
        switch (mes) {
            case 12: case 1: case 2:
                season = "Зима"; break;
            case 3: case 4: case 5:
                season = "Весна"; break;
            case 6: case 7: case 8:
                season = "Лето"; break;
            case 9: case 10: case 11:
                season = "Осень"; break;
            default:
                season = "Некорректный номер месяца"; break;
        }
        resLabel.setText(season);
    }

}
