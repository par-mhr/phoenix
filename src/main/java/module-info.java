module com.phoenix.phoenix {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.phoenix.phoenix to javafx.fxml;
    exports com.phoenix.phoenix;
}