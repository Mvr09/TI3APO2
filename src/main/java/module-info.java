module com.mike.ti3apo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mike.ti3apo2 to javafx.fxml;
    exports com.mike.ti3apo2;
}