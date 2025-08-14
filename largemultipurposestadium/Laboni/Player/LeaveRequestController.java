package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.time.LocalDate;

public class LeaveRequestController
{
    @javafx.fxml.FXML
    private DatePicker leaveDatePicker;
    @javafx.fxml.FXML
    private TextArea reasonArea;
    @javafx.fxml.FXML
    private ComboBox<String> leaveTypeCombo;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        leaveTypeCombo.getItems().addAll("Personal", "Medical");

    }

    @javafx.fxml.FXML
    public void SubmitRequest(ActionEvent actionEvent) {
        String leaveType = leaveTypeCombo.getValue();
        LocalDate leaveDate = leaveDatePicker.getValue();
        String reason = reasonArea.getText().trim();

        if (leaveType == null || leaveDate == null || reason.isEmpty()) {
            statusLabel.setText("Please fill in all fields!");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        statusLabel.setText("Leave request submitted for " + leaveDate);
        statusLabel.setStyle("-fx-text-fill: green;");

        leaveTypeCombo.setValue(null);
        leaveDatePicker.setValue(null);
        reasonArea.clear();
    }
}
