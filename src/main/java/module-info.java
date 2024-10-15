module com.example.gui2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui2 to javafx.fxml;
    exports com.example.gui2;
}