package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import jdk.internal.icu.text.UnicodeSet;

public class FitnessReportController
{
    @FXML
    private TableView<FitnessReport> reportTable;
    @FXML
    private TableColumn<FitnessReport, String> sleepColumn;
    @FXML
    private TableColumn<FitnessReport, String> injuryColumn;
    @FXML
    private TextField weightField1;
    @FXML
    private TextArea injuryArea;
    @FXML
    private TableColumn<FitnessReport, String> weightColumn;

    @FXML
    public void initialize() {
        weightColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getWeight()));
        sleepColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getSleepHours()));
        injuryColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInjuryNotes()));

        ObservableList<FitnessReport> reports = null;
        reportTable.setItems(null);
    }
    @FXML
    public void handleSubmit() {
        String weight = weightField1.getText().trim();
        java.awt.Label sleepField = new java.awt.Label();
        String sleep = sleepField.getText().trim();
        String injury = injuryArea.getText().trim();

        if (weight.isEmpty() || sleep.isEmpty()) {
            showAlert();
            return;
        }

        FitnessReport report = new FitnessReport(weight, sleep, injury);
        UnicodeSet reports = null;
        final UnicodeSet add = reports.add((CharSequence) report);

        weightField1.clear();
        //sleepField.clear();
        injuryArea.clear();
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Weight and Sleep Hours are required!");
        alert.showAndWait();
    }

}