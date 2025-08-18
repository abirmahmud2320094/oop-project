package com.example.opp_project_g10.abirm;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class u5c {

    @javafx.fxml.FXML
    private TableColumn quantityrequiredTC;
    @javafx.fxml.FXML
    private TextArea requiredEquipmentTA;
    @javafx.fxml.FXML
    private TableColumn equipmentNameTC;
    @javafx.fxml.FXML
    private Label showconfirmationabel;
    @javafx.fxml.FXML
    private TextField estimatedCostTF;
    @javafx.fxml.FXML
    private TableColumn availablequantityTC;
    @javafx.fxml.FXML
    private CheckBox logisticsApprovedCB;
    @javafx.fxml.FXML
    private TextField newtemNameTF;
    @javafx.fxml.FXML
    private Label showapprovalstatusLabel;
    @javafx.fxml.FXML
    private CheckBox equipmentReadyCB;
    @javafx.fxml.FXML
    private Label checklistconfirmationLabel;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableView emtabilview;
    @javafx.fxml.FXML
    private Label approveLogisticsCostsLabel;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
        // Optional: initialize dummy values if needed
    }

    @javafx.fxml.FXML
    public void checkAvailabilityButton(ActionEvent actionEvent) {
        checklistconfirmationLabel.setText("Equipment availability checked (Demo)");
    }

    @javafx.fxml.FXML
    public void finalizeChecklisButton(ActionEvent actionEvent) {
        checklistconfirmationLabel.setText(" Checklist finalized (Demo)");
    }

    @javafx.fxml.FXML
    public void requestltemButton(ActionEvent actionEvent) {
        String item = newtemNameTF.getText();
        int qty = 0;
        try {
            qty = Integer.parseInt(quantityTF.getText());
        } catch (NumberFormatException e) {
            showconfirmationabel.setText("Invalid quantity!");
            return;
        }
        showconfirmationabel.setText("🛒 Requested " + qty + " x " + item + " (Demo)");
    }

    @javafx.fxml.FXML
    public void approveCostButton(ActionEvent actionEvent) {
        approveLogisticsCostsLabel.setText(" Cost approved (Demo)");
        logisticsApprovedCB.setSelected(true);
    }
}
