package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MedicalReportsController {

    @FXML
    private TableView<MedicalReports> medicalTable;
    @FXML
    private TableColumn<MedicalReports, String> typeColumn;
    @FXML
    private TableColumn<MedicalReports, String> dateColumn;
    @FXML
    private TableColumn<MedicalReports, String> detailsColumn;
    @FXML
    private TextArea reportDetails;

    private ObservableList<MedicalReports> recordsList;

    @FXML
    public void initialize() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        detailsColumn.setCellValueFactory(new PropertyValueFactory<>("details"));

        recordsList = FXCollections.observableArrayList();
        medicalTable.setItems(recordsList);
        loadSampleRecords();

        medicalTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    reportDetails.setText(newSelection != null ? newSelection.getDetails() : "");
                }
        );
    }

    private void loadSampleRecords() {
        recordsList.add(new MedicalReports(
                "Injury Report",
                "2025-08-01",
                "Knee sprain",
                "Player injured during practice. Requires 2 weeks rest."
        ));

        recordsList.add(new MedicalReports(
                "Physical Exam",
                "2025-07-15",
                "Good condition",
                "All vitals normal. Cleared for full participation."
        ));
    }

    @FXML
    public void refreshOnAction(ActionEvent event) {
        medicalTable.getSelectionModel().clearSelection();
        reportDetails.clear();
        recordsList.clear();
        loadSampleRecords();
    }
    public class MedicalReports extends AnchorPane {
        @FXML private TableView<MedicalReports> medicalTable;


        public MedicalReports() {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalReports.fxml"));
            loader.setRoot(this);
            loader.setController(this);

            try {
                loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public MedicalReports(String physicalExam, String date, String goodCondition, String string) {

        }

        public String getDetails() {
            return "";
        }
    }


        }


