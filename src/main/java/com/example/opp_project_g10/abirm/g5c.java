package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class g5c {

    @javafx.fxml.FXML
    private Label totalSalesLabel;
    @javafx.fxml.FXML
    private Label endDatePicker;
    @javafx.fxml.FXML
    private Label startDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> eventFilterComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> ticketCategoryFilterComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        // dummy items
        eventFilterComboBox.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
        ticketCategoryFilterComboBox.setItems(FXCollections.observableArrayList("VIP", "Regular", "Student"));
    }

    @javafx.fxml.FXML
    public void shareReportButtonOA(ActionEvent actionEvent) {
        totalSalesLabel.setText("Report shared successfully (Demo)");
    }

    @javafx.fxml.FXML
    public void exportPdfButtonOA(ActionEvent actionEvent) {
        totalSalesLabel.setText("PDF exported (Demo)");
    }

    @javafx.fxml.FXML
    public void generateReportButtonOA(ActionEvent actionEvent) {
        totalSalesLabel.setText("Report generated (Demo)");
    }

    @javafx.fxml.FXML
    public void exportCsvButtonOA(ActionEvent actionEvent) {
        totalSalesLabel.setText("CSV exported (Demo)");
    }
}
