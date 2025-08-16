package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class MedicalClearance11Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> playerCombo;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombo;

    @javafx.fxml.FXML
    public void initialize() {
        playerCombo.getItems().addAll("Player-101", "Player-102", "Player-103");

        statusCombo.getItems().addAll("Fit", "Unfit");
    }

    @javafx.fxml.FXML
    public void handleSubmit(ActionEvent actionEvent) {
        String player = playerCombo.getValue();
        String status = statusCombo.getValue();
        String remarks = remarksArea.getText();

        if (player == null || status == null) {
            System.out.println("Please select player and status!");
            return;
        }


        System.out.println("Player: " + player);
        System.out.println("Status: " + status);
        System.out.println("Remarks: " + remarks);
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        playerCombo.setValue(null);
        statusCombo.setValue(null);
        remarksArea.clear();
    }
}