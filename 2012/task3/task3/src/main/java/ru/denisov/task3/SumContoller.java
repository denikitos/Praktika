package ru.denisov.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SumContoller {

    @FXML
    private Button OkButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button btnButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<?> dataListView;

    @FXML
    private TextField kgTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void OkButtonOnAction(ActionEvent event) {

    }

    @FXML
    void btnButtonOnAction(ActionEvent event) {

    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        double Kg = Double.parseDouble(kgTextField.getText());
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append("Стоимость ").append(i).append(" кг: ").append(Kg * i).append(" \n");
        }
        resultLabel.setText(result.toString());
        btnButton.setText(btnButton.toString());


    }
}



