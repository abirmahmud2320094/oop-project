module cse213.com.group10.largemultipurposestadium {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    // for opp_project_g10 packages
    opens com.example.opp_project_g10 to javafx.fxml;
    opens com.example.opp_project_g10.Abid to javafx.fxml;
    exports com.example.opp_project_g10;

    // for largemultipurposestadium packages
    opens cse213.com.group10.largemultipurposestadium to javafx.fxml;
    opens cse213.com.group10.largemultipurposestadium.Laboni.Player to javafx.fxml;
    exports cse213.com.group10.largemultipurposestadium;
}