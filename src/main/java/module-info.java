module com.example.opp_project_g10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.opp_project_g10 to javafx.fxml;
    exports com.example.opp_project_g10;
}