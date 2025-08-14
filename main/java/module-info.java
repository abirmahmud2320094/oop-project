module cse213.com.group10.largemultipurposestadium {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse213.com.group10.largemultipurposestadium to javafx.fxml;
    //opens cse213.com.group10.largemultipurposestadium.Laboni.Player to javafx.fxml;


    opens cse213.com.group10.largemultipurposestadium.Laboni.Player to javafx.fxml;
    //exports cse213.com.group10.largemultipurposestadium.Laboni.Player;

    //opens cse213.com.group10.largemultipurposestadium.Laboni to javafx.fxml;
    //opens cse213.com.group10.largemultipurposestadium.Laboni.Player to javafx.fxml;
    //opens cse213.com.group10.oop-project.Laboni.Player to javafx.fxml;
    //opens cse213.com.group10.largemultipurposestadium.Laboni.Player.TrainingSession to javafx.fxml, java.base;

    //exports cse213.com.group10.largemultipurposestadium;
    //exports cse213.com.group10.largemultipurposestadium.controllers;
    //opens cse213.com.group10.largemultipurposestadium to javafx.fxml;
    //opens cse213.com.group10.largemultipurposestadium.controllers to javafx.fxml;

    exports cse213.com.group10.largemultipurposestadium;
    //exports cse213.com.group10.largemultipurposestadium.controllers;

}