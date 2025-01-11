package ru.denisov.denisov_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import static ru.denisov.denisov_prakt7.util.Manager.showChesScene;
import static ru.denisov.denisov_prakt7.util.Manager.showSecondScene;

public class f {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private RadioButton a;

    @FXML
    private RadioButton b;

    @FXML
    private RadioButton c;

    @FXML
    private CheckBox full;

    @FXML
    private CheckBox half;

    @FXML
    private Button reg1;

    @FXML
    private CheckBox small;

    @FXML
    private Label vznos;

    private int totalSum = 0;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void reg1(ActionEvent event) {
        showChesScene("fi.fxml", "Marathon Skills 2016 – Registration confirmation");
    }

    @FXML
    void a(ActionEvent event) {
        updateSum();
    }

    @FXML
    void b(ActionEvent event) {
        updateSum();
    }

    @FXML
    void c(ActionEvent event) {
        updateSum();
    }

    @FXML
    void full(ActionEvent event) {
        updateSum();
    }

    @FXML
    void half(ActionEvent event) {
        updateSum();
    }

    @FXML
    void small(ActionEvent event) {
        updateSum();
    }

    private void updateSum() {

        totalSum = 0;


        if (a.isSelected()) {
            totalSum += 0;
        }
        if (b.isSelected()) {
            totalSum += 20;
        }
        if (c.isSelected()) {
            totalSum += 45;
        }


        if (full.isSelected()) {
            totalSum += 145;
        }
        if (half.isSelected()) {
            totalSum += 75;
        }
        if (small.isSelected()) {
            totalSum += 20;
        }

        vznos.setText("$" + totalSum );
    }
}
