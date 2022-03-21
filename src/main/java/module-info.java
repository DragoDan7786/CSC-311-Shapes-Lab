module com.mycompany.shapeslabsa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.shapeslabsa to javafx.fxml;
    exports com.mycompany.shapeslabsa;
}
