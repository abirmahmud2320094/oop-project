package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedicalReportsController
{
    @FXML
    private TableColumn<MedicalReports , String> detailsColumn;
    @FXML
    private ComboBox< String> categoryFilter;
    @FXML
    private TableView<Object> medicalTable;
    @FXML
    private TableColumn<MedicalReports , String>dateColumn;
    @FXML
    private TableColumn<MedicalReports , String> typeColumn;

    @FXML
    public void initialize() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        detailsColumn.setCellValueFactory(new PropertyValueFactory<>("details"));


        ObservableList<Object> allReports = FXCollections.observableArrayList(
                new MedicalReports("Injury", "2025-05-10", "Left ankle sprain"),
                new MedicalReports("Fitness", "2025-07-01", "Passed all fitness tests"),
                new MedicalReports("Clearance", "2025-08-01", "Cleared for full play"),
                new MedicalReports("Injury", "2025-08-10", "Minor shoulder strain")
        );

        medicalTable.setItems(allReports);

        categoryFilter.setItems(FXCollections.observableArrayList());
        //categoryFilter.setValue("All" );

        categoryFilter.setOnAction(e -> filterReports());
    }

    private void filterReports() {
        String selected = String.valueOf(categoryFilter.getValue());
        ObservableList<Object> allReports = null;
        if ("All".equals(selected)) {
            medicalTable.setItems(null);
        } else medicalTable.setItems(allReports.filtered(r -> false));
    }
}
