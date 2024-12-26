module ru.denisov.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.task2 to javafx.fxml;
    exports ru.denisov.task2;
}