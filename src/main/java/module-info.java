module com.example.coding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coding to javafx.fxml;
    exports com.example.coding;
}