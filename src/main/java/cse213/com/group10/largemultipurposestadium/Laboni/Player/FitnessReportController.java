package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FitnessReportController {
    @javafx.fxml.FXML
    private TableView<FitnessReport> reportTable;
    @javafx.fxml.FXML
    private TableColumn<FitnessReport, String> sleepColumn;
    @javafx.fxml.FXML
    private TableColumn<FitnessReport, String> injuryColumn;
    @javafx.fxml.FXML
    private TextField weightField1;
    @javafx.fxml.FXML
    private TextArea injuryArea;
    @javafx.fxml.FXML
    private TableColumn<FitnessReport, String> weightColumn;
    @javafx.fxml.FXML
    private TextField SleepHoursTF; // Fixed to use this for sleep hours

    private final ObservableList<FitnessReport> reports = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        weightColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getWeight()));
        sleepColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getSleepHours()));
        injuryColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInjuryNotes()));


        reportTable.setItems(reports);
    }

    @javafx.fxml.FXML
    public void handleSubmit() {
        String weight = weightField1.getText().trim();
        String sleep = SleepHoursTF.getText().trim(); // Use the existing TextField
        String injury = injuryArea.getText().trim();

        if (weight.isEmpty() || sleep.isEmpty()) {
            showAlert();
            return;
        }

        FitnessReport report = new FitnessReport(weight, sleep, injury);
        reports.add(report);

        weightField1.clear();
        SleepHoursTF.clear();
        injuryArea.clear();
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Weight and Sleep Hours are required!");
        alert.showAndWait();
    }
}