module com.example.cinema1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cinema1 to javafx.fxml;
    exports com.example.cinema1;
}