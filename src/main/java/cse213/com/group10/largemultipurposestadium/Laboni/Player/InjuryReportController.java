package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InjuryReportController
{
    @javafx.fxml.FXML
    private TextField playerIdField;
    @javafx.fxml.FXML
    private Label remarksArea;
    @javafx.fxml.FXML
    private ComboBox<String> injuryTypeCombo;
    @javafx.fxml.FXML
    private DatePicker injuryDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        injuryTypeCombo.getItems().addAll("Fracture", "Sprain", "Concussion", "Muscle Tear");
    }

    @javafx.fxml.FXML
    public void handleSubmit(ActionEvent actionEvent) {
        String playerId = playerIdField.getText();
        String injuryType = injuryTypeCombo.getValue();
        String date = (injuryDatePicker.getValue() != null) ? injuryDatePicker.getValue().toString() : "";
        String remarks = remarksArea.getText();


        if (playerId.isEmpty() || injuryType == null || date.isEmpty()) {
            System.out.println("Please fill all required fields!");
            return;
        }


        System.out.println("Player ID: " + playerId);
        System.out.println("Injury Type: " + injuryType);
        System.out.println("Date: " + date);
        System.out.println("Remarks: " + remarks);
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        playerIdField.clear();
        injuryTypeCombo.setValue(null);
        injuryDatePicker.setValue(null);
        remarksArea.cacheShapeProperty();
    }
}