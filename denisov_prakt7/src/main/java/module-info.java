module ru.denisov.denisov_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.denisov.denisov_prakt7 to javafx.fxml;
    exports ru.denisov.denisov_prakt7;
    exports ru.denisov.denisov_prakt7.controller;
    opens ru.denisov.denisov_prakt7.controller to javafx.fxml;
    exports ru.denisov.denisov_prakt7.util;
    opens ru.denisov.denisov_prakt7.util to javafx.fxml;
}