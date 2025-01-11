package ru.denisov.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField MTextField;

    @FXML
    private TextField NTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText());
        int m = Integer.parseInt(MTextField.getText());
        String cardName = "";
        switch (n) {
            case 6: cardName = "шестёрка"; break;
            case 7: cardName = "семёрка"; break;
            case 8: cardName = "восьмёрка"; break;
            case 9: cardName = "девятка"; break;
            case 10: cardName = "десятка"; break;
            case 11: cardName = "валет"; break;
            case 12: cardName = "дама"; break;
            case 13: cardName = "король"; break;
            case 14: cardName = "туз"; break;
        }
        switch (m) {
            case 1: cardName += " пик"; break;
            case 2: cardName += " треф"; break;
            case 3: cardName += " бубен"; break;
            case 4: cardName += " червей"; break;
        }
        resLabel.setText(cardName);
    }

}
