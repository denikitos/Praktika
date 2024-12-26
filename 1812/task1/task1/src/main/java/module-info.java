module ru.denisov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.task1 to javafx.fxml;
    exports ru.denisov.task1;
}