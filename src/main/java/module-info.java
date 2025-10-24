module com.example.rutotajava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rutotajava to javafx.fxml;
    exports com.example.rutotajava;
}