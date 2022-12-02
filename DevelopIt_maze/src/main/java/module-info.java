module com.developit.developit_web {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.developIt to javafx.fxml;
    exports com.developIt;
}