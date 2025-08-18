package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class u4c {

    @javafx.fxml.FXML
    private Label displaynotificationsentstatuslabei;
    @javafx.fxml.FXML
    private TableColumn roleTC;
    @javafx.fxml.FXML
    private TableColumn nameTc;
    @javafx.fxml.FXML
    private Label confirmationorrrorLabel;
    @javafx.fxml.FXML
    private TableView staffTV;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private ComboBox<String> assignRoleCB;
    @javafx.fxml.FXML
    private TableColumn availableTimeTC;
    @javafx.fxml.FXML
    private ComboBox<String> selectEventCB;
    @javafx.fxml.FXML
    private Label isplaysuccesserrorconfirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        // Dummy events and roles
        selectEventCB.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
        assignRoleCB.setItems(FXCollections.observableArrayList("Security", "Lighting", "Sound", "Staff"));
    }

    @javafx.fxml.FXML
    public void sendScheduleBUTTONAction(ActionEvent actionEvent) {
        displaynotificationsentstatuslabei.setText(" Schedule sent (Demo)");
    }

    @javafx.fxml.FXML
    public void confirmAssignmentsButton(ActionEvent actionEvent) {
        confirmationorrrorLabel.setText(" Assignments confirmed (Demo)");
    }

    @javafx.fxml.FXML
    public void ssignRoleButton(ActionEvent actionEvent) {
        String role = assignRoleCB.getValue();
        isplaysuccesserrorconfirmationLabel.setText(" Role assigned: " + role + " (Demo)");
    }

    @javafx.fxml.FXML
    public void notifyAssignedStaffButtion(ActionEvent actionEvent) {
        displaynotificationsentstatuslabei.setText(" Staff notified (Demo)");
    }
}
