module com.example.final_prj {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.final_prj to javafx.fxml;
    exports com.example.final_prj;
}