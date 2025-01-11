package ru.denisov.denisov_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static ru.denisov.denisov_prakt7.util.Manager.showSecondScene;

public class q {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private TextField email;

    @FXML
    private TextField pass;

    @FXML
    private Button reg;

    private static String registeredEmail;
    private static String registeredPassword;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void reg(ActionEvent event) {
        String emailInput = email.getText().trim();
        String passwordInput = pass.getText().trim();

        if (emailInput.isEmpty() || passwordInput.isEmpty()) {
            return;
        }

        registeredEmail = emailInput;
        registeredPassword = passwordInput;


        showSecondScene("hello-view.fxml", "Marathon Skills 2016");
    }

    public static String getRegisteredEmail() {
        return registeredEmail;
    }

    public static String getRegisteredPassword() {
        return registeredPassword;
    }
}
