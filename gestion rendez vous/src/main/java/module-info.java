module com.example.aphrodite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aphrodite to javafx.fxml;
    exports com.example.aphrodite;
}