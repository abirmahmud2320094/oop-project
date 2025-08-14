package com.example.opp_project_g10.Abid;

import com.example.opp_project_g10.PanelSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class DashBoardController
{
    @javafx.fxml.FXML
    private BorderPane dashboard_BP;
    @javafx.fxml.FXML
    private Menu home_MB;
    @javafx.fxml.FXML
    private Menu CoordinateWithstaff_MB;
    @javafx.fxml.FXML
    private AnchorPane anchorPanel;  // Target panel for PanelSwitcher
    @javafx.fxml.FXML
    private Menu StadiumManager_MB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void configureTicketPricing_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manageVendor_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignStuffroles_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewLiveinfo_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/ViewLiveEventsInfo");
    }

    @javafx.fxml.FXML
    public void submitfeedback_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/SubmitFeedback");
    }

    @javafx.fxml.FXML
    public void signOut_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void buyfoodOrdrinks_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/BuyFoodOrDrinks");
    }

    @javafx.fxml.FXML
    public void browseupcomming_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/BrowseUpcommingEvent");
    }

    @javafx.fxml.FXML
    public void analizeEventReport_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSpecialGuest_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reserveParkingspot_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/ReserveParkingSpot");
    }

    @javafx.fxml.FXML
    public void viewOverallstadiumDashboard_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void registarForloyality_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/RegisterForLoyaltyProgram");
    }

    @javafx.fxml.FXML
    public void superviseStuffChecking_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void purchaseticket_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/PurchaseTicket");
    }

    @javafx.fxml.FXML
    public void scheduleNewevent_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportLostitems_OA(ActionEvent actionEvent) {
        PanelSwitcher.switchPanel(anchorPanel, "Abid/ReportLostItens");
    }
}
