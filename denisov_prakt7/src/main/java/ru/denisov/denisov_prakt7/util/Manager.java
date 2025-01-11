package ru.denisov.denisov_prakt7.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.denisov.denisov_prakt7.HelloApplication;

import java.io.IOException;

public class Manager {
    private static String emailreg;
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaximized(true);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showTriScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showChScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showCheScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showChesScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("q.fxml"));
        Scene registrationScene = new Scene(loader.load());
        primaryStage.setScene(registrationScene);
        primaryStage.setTitle("Email");
        primaryStage.show();
    }
    public static void setRegEmail(String Email){
        emailreg = Email;
    }
    public static String getEmailreg(){
        return emailreg;
    }
}