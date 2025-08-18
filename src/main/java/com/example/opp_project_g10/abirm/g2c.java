package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class g2c {

    @javafx.fxml.FXML
    private Label ticketIdLabel;
    @javafx.fxml.FXML
    private TextField amountPaidField;
    @javafx.fxml.FXML
    private ComboBox<String> eventSelectComboBo;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField buyerEmailField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField buyerNameTF;

    @FXML
    public void initialize() {
        // Dummy items
        eventSelectComboBo.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
        paymentMethodComboBox.setItems(FXCollections.observableArrayList("Cash", "Card", "bKash"));
    }

    @FXML
    public void emailTicketButton(ActionEvent actionEvent) {
        String name = buyerNameTF.getText();
        String email = buyerEmailField.getText();
        String event = eventSelectComboBo.getValue();

        statusLabel.setText("📧 Ticket emailed to " + name + " (" + email + ") for " + event);
    }

    @FXML
    public void printTicketButton(ActionEvent actionEvent) {
        String event = eventSelectComboBo.getValue();
        String amount = amountPaidField.getText();
        String payment = paymentMethodComboBox.getValue();

        statusLabel.setText("🖨 Printed ticket for " + event + " | Paid: " + amount + " (" + payment + ")");
    }
}
