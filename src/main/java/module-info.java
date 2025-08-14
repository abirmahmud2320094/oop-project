module com.example.opp_project_g10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.opp_project_g10 to javafx.fxml;
    opens com.example.opp_project_g10.Abid to javafx.fxml;
    exports com.example.opp_project_g10;
}
