package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.time.LocalDate;

public class ScheduleCheckup10Controller
{
    @javafx.fxml.FXML
    private TextField checkupTimeField;
    @javafx.fxml.FXML
    private ComboBox<String> doctorCombo;
    @javafx.fxml.FXML
    private Button handleSubmit;
    @javafx.fxml.FXML
    private DatePicker checkupDatePicker;
    @javafx.fxml.FXML
    private ListView<String> playersListView;

    @javafx.fxml.FXML
    public void initialize() {
        doctorCombo.getItems().addAll("Dr. Smith", "Dr. Ahmed", "Dr. Lee");
    }


    @javafx.fxml.FXML
    public void handleAddPlayer(ActionEvent actionEvent) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add Player");
        dialog.setHeaderText("Enter Player Name");
        dialog.setContentText("Name:");
        dialog.showAndWait().ifPresent(name -> {
            if (!name.trim().isEmpty()) {
                playersListView.getItems().add(name.trim());
            }
        });
    }

    @javafx.fxml.FXML
    public void handleRemovePlayer(ActionEvent actionEvent) {
        String selected = playersListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            playersListView.getItems().remove(selected);
        }
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        checkupDatePicker.setValue(null);
        checkupTimeField.clear();
        doctorCombo.setValue(null);
        playersListView.getItems().clear();
    }

    @javafx.fxml.FXML
    public void handleSubmit(ActionEvent actionEvent) {
        LocalDate date = checkupDatePicker.getValue();
        String time = checkupTimeField.getText();
        String doctor = doctorCombo.getValue();

        if (date == null || time.isEmpty() || doctor == null || playersListView.getItems().isEmpty()) {
            System.out.println("Please fill all fields!");
            return;
        }

        System.out.println("Checkup Scheduled on " + date + " at " + time + " with " + doctor);
        System.out.println("Players: " + playersListView.getItems());
    }
}