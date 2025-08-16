package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TrainingSessionController {

    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> timeColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> locationColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSession, String> coachColumn;
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private TextField coachField;
    @javafx.fxml.FXML
    private TextField timeField;
    @javafx.fxml.FXML
    private TableView<TrainingSession> scheduleTable;

    private final ObservableList<TrainingSession> sessions = FXCollections.observableArrayList();
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_DATE;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    @javafx.fxml.FXML
    public void initialize() {

        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        timeColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        locationColumn.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        coachColumn.setCellValueFactory(cellData -> cellData.getValue().coachProperty());

        scheduleTable.setItems(sessions);
        datePicker.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
        try {
            LocalDate date = datePicker.getValue();
            String time = timeField.getText().trim();
            String location = locationField.getText().trim();
            String coach = coachField.getText().trim();


            if (date == null) {
                showAlert("Date is required");
                return;
            }
            if (time.isEmpty() || !isValidTimeFormat(time)) {
                showAlert("Please enter valid time (HH:mm format)");
                return;
            }
            if (location.isEmpty()) {
                showAlert("Location is required");
                return;
            }
            if (coach.isEmpty()) {
                showAlert("Coach name is required");
                return;
            }

            TrainingSession newSession = new TrainingSession(
                    date.format(DATE_FORMATTER),
                    time,
                    location,
                    coach
            );
            sessions.add(newSession);
            clearFields();

        } catch (Exception e) {
            showAlert("Error creating session: " + e.getMessage());
        }
    }

    private boolean isValidTimeFormat(String time) {
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    private void clearFields() {
        timeField.clear();
        locationField.clear();
        coachField.clear();
        timeField.requestFocus();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    private void handleDelete() {
        TrainingSession selected = scheduleTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            sessions.remove(selected);
        } else {
            showAlert("Please select a session to delete");
        }
    }

}