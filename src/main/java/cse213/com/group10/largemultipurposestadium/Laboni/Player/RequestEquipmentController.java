package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class RequestEquipmentController
{
    @javafx.fxml.FXML
    private TextArea ReasonField;
    @javafx.fxml.FXML
    private Label StatusLabel;
    @javafx.fxml.FXML
    private ComboBox<String> EquipmentTypeBox;
    @javafx.fxml.FXML
    private TextField QuantityField;

    @javafx.fxml.FXML
    public void initialize() {
        EquipmentTypeBox.getItems().addAll(
                "Football", "Basketball", "Volleyball",
                "Tennis Racket", "Cricket Bat", "Hockey Stick",
                "Baseball Glove", "Swimming Goggles", "Track Spikes"
        );

        if (!EquipmentTypeBox.getItems().isEmpty()) {
            EquipmentTypeBox.getSelectionModel().selectFirst();
        }

        StatusLabel.setText("");

        ReasonField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal.length() > 500) {
                ReasonField.setText(oldVal);
            }
        });

        QuantityField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.matches("\\d*")) {
                QuantityField.setText(oldVal);
            }
        });
    }



    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
        if (EquipmentTypeBox.getValue() == null || EquipmentTypeBox.getValue().isEmpty()) {
            showStatus("Please select equipment type", true);
            return;
        }

        if (!isValidQuantity(QuantityField.getText())) {
            showStatus("Quantity must be a number between 1-100", true);
            return;
        }

        if (ReasonField.getText().trim().isEmpty() || ReasonField.getText().length() < 10) {
            showStatus("Reason must be at least 10 characters", true);
            return;
        }

        String message = String.format("Request submitted!\nEquipment: %s\nQuantity: %s",
                EquipmentTypeBox.getValue(),
                QuantityField.getText());

        showStatus(message, false);
        ClearOnAction(null);
    }

    @javafx.fxml.FXML
    public void ClearOnAction(ActionEvent actionEvent) {

        if (!EquipmentTypeBox.getItems().isEmpty()) {
            EquipmentTypeBox.getSelectionModel().selectFirst();
        }
        QuantityField.clear();
        ReasonField.clear();
        StatusLabel.setText("");
        QuantityField.requestFocus();
    }

    @javafx.fxml.FXML
    public void BackOnAction(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PlayerDashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Player Dashboard");
        } catch (IOException e) {
            showStatus("Error loading dashboard: " + e.getMessage(), true);
        }
    }

    private boolean isValidQuantity(String input) {
        try {
            int quantity = Integer.parseInt(input);
            return quantity > 0 && quantity <= 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void showStatus(String message, boolean isError) {
        StatusLabel.setText(message);
        StatusLabel.setTextFill(isError ? Color.RED : Color.GREEN);
    }
}