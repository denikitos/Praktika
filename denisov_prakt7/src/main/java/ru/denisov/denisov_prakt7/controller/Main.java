package ru.denisov.denisov_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.denisov.denisov_prakt7.util.Manager.showSecondScene;

public class Main {


    @FXML
    private Button BackB;

    @FXML
    private Button Login;

    @FXML
    private Button wanna;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showSecondScene("dva.fxml","Marathon Skills 2016 - Register as a runner");

    }

    @FXML
    void wanna(ActionEvent event) {
        showSecondScene("dva.fxml","Marathon Skills 2016 - Register as a runner");

    }

}
