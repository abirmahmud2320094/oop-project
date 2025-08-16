package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Callback;
import javafx.scene.control.ListCell;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class MedicalRecordsController {
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private TextArea reportContentArea;
    @javafx.fxml.FXML
    private ListView<MedicalRecords> reportsListView;

    private final ObservableList<MedicalRecords> allReports = FXCollections.observableArrayList();
    private final Map<String, Predicate<MedicalRecords>> categoryFilters = new HashMap<>();
    private final FilteredList<MedicalRecords> filteredReports = new FilteredList<>(allReports);

    @javafx.fxml.FXML
    public void initialize() {
        setupCategoryFilters();
        setupCategoryComboBox();
        loadSampleReports();
        setupListView();


        categoryComboBox.getSelectionModel().selectFirst();
    }

    private void setupCategoryFilters() {
        categoryFilters.put("Injury Reports", report ->
                "injury".equalsIgnoreCase(report.getCategory()));
        categoryFilters.put("Fitness Assessments", report ->
                "fitness".equalsIgnoreCase(report.getCategory()));
        categoryFilters.put("Clearance Certificates", report ->
                "clearance".equalsIgnoreCase(report.getCategory()));
    }

    private void setupCategoryComboBox() {
        categoryComboBox.getItems().addAll(
                "Injury Reports",
                "Fitness Assessments",
                "Clearance Certificates"
        );

        categoryComboBox.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldVal, newCategory) -> {
                    if (newCategory != null) {
                        filteredReports.setPredicate(categoryFilters.get(newCategory));
                    }
                }
        );
    }

    private void loadSampleReports() {
        allReports.addAll(
                new MedicalRecords("injury", "Ankle Sprain Report",
                        "Diagnosis: Grade 1 lateral ankle sprain\nTreatment: RICE protocol\nRecovery Time: 2-3 weeks",
                        LocalDate.of(2025, 7, 15)),

                new MedicalRecords("fitness", "Cardiovascular Assessment",
                        "VO2 Max: 52.3 ml/kg/min\nResting HR: 58 bpm\nRecovery Rate: Excellent",
                        LocalDate.of(2025, 7, 22)),

                new MedicalRecords("clearance", "Full Activity Clearance",
                        "Player cleared for all team activities\nNo restrictions\nValid until: 2026-01-01",
                        LocalDate.of(2025, 8, 1)),

                new MedicalRecords("injury", "Concussion Protocol Completion",
                        "Return-to-play protocol completed successfully\nNo residual symptoms\nCleared for contact",
                        LocalDate.of(2025, 6, 10))
        );
    }

    private void setupListView() {
        reportsListView.setItems(filteredReports);
        reportsListView.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(MedicalRecords report, boolean empty) {
                super.updateItem(report, empty);
                if (empty || report == null) {
                    setText(null);
                } else {
                    setText(String.format("%s (%s)", report.getTitle(), report.getDate()));
                }
            }
        });
    }

    @javafx.fxml.FXML
    public void handleViewReport(ActionEvent actionEvent) {
        MedicalRecords selected = reportsListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            reportContentArea.setText(
                    "REPORT DETAILS\n" +
                            "==============\n" +
                            "Title: " + selected.getTitle() + "\n" +
                            "Category: " + selected.getCategory().toUpperCase() + "\n" +
                            "Date: " + selected.getDate() + "\n\n" +
                            "CONTENT:\n" +
                            selected.getContent()
            );
        } else {
            reportContentArea.setText("Please select a report from the list");
        }

    }
}