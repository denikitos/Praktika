module ru.denisov.denisov_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.denisov_task1 to javafx.fxml;
    exports ru.denisov.denisov_task1;
}