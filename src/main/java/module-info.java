module com.example.smapleapp_git {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.smapleapp_git to javafx.fxml;
    exports com.example.smapleapp_git;
}