module com.example.legalgrid {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.legalgrid to javafx.fxml;
    exports com.example.legalgrid;
}