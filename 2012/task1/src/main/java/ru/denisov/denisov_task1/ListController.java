package ru.denisov.denisov_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;


    private int sum = 0;


    @FXML
    void addButtonOnAction(ActionEvent event) {
        try {

            int number = Integer.parseInt(numberTextField.getText());
            dataListView.getItems().add(number);
            numberTextField.clear();
        } catch (NumberFormatException e) {

            answerLabel.setText("Пожалуйста, введите корректное число.");
        }
    }


    @FXML
    void OkButtonOnAction(ActionEvent event) {

        sum = 0;


        List<Integer> numbers = dataListView.getItems();
        for (int num : numbers) {

            if (num % 3 == 0 && num % 10 == 4) {
                sum += num;
            }
        }


        answerLabel.setText("Сумма чисел: " + sum);
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {

        dataListView.getItems().clear();
        answerLabel.setText("");
        numberTextField.clear();
    }
}
