module ru.denisov.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.task3 to javafx.fxml;
    exports ru.denisov.task3;
}