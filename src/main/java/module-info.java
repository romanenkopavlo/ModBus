module fr.btsciel.modbus {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.btsciel.modbus to javafx.fxml;
    exports fr.btsciel.modbus;
}