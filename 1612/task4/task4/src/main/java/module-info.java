module ru.denisov.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.task4 to javafx.fxml;
    exports ru.denisov.task4;
}