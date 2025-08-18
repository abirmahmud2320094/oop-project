package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class g3c {

    @javafx.fxml.FXML
    private TextArea refundReasonArea;
    @javafx.fxml.FXML
    private Label ticketStatusLabel;
    @javafx.fxml.FXML
    private TextField refundAmountField;
    @javafx.fxml.FXML
    private ComboBox<String> refundMethodComboBox;
    @javafx.fxml.FXML
    private Label eligibilityStatusLabel;
    @javafx.fxml.FXML
    private TextField ticketIdSearchField;

    @javafx.fxml.FXML
    public void initialize() {
        refundMethodComboBox.setItems(FXCollections.observableArrayList("Cash", "Card", "bKash"));
    }

    @javafx.fxml.FXML
    public void searchTicketButtonOA(ActionEvent actionEvent) {
        String ticketId = ticketIdSearchField.getText();
        ticketStatusLabel.setText("Ticket " + ticketId + " found (Demo Data)");
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOA(ActionEvent actionEvent) {
        ticketStatusLabel.setText("Ticket status updated!");
    }

    @javafx.fxml.FXML
    public void processRefundButtonOA(ActionEvent actionEvent) {
        String amount = refundAmountField.getText();
        String method = refundMethodComboBox.getValue();
        String reason = refundReasonArea.getText();

        ticketStatusLabel.setText("Refunded " + amount + " via " + method + "\nReason: " + reason);
    }

    @javafx.fxml.FXML
    public void checkEligibilityButtonOA(ActionEvent actionEvent) {
        eligibilityStatusLabel.setText("✔ Eligible for refund (Demo)");
    }
}
