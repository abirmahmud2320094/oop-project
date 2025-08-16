package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import com.sun.javafx.charts.Legend;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.details;

public class EmergencyReport14Controller
{
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private TableColumn<EmergencyReport14, String> colDetails;
    @javafx.fxml.FXML
    private DatePicker incidentDatePicker;
    @javafx.fxml.FXML
    private TextField incidentTimeField;
    @javafx.fxml.FXML
    private ComboBox<String> incidentTypeCombo;
    @javafx.fxml.FXML
    private TableColumn<EmergencyReport14, String> colType;
    @javafx.fxml.FXML
    private TableColumn<EmergencyReport14, String> colDateTime;
    @javafx.fxml.FXML
    private TextField incidentIdField;
    @javafx.fxml.FXML
    private TableColumn<EmergencyReport14, String> colLocation;
    @javafx.fxml.FXML
    private TableView<EmergencyReport14> emergencyTable;
    @javafx.fxml.FXML
    private TableColumn<EmergencyReport14, String> colId;
    private final ObservableList<EmergencyReport14> reportList = FXCollections.observableArrayList();
    private Legend.LegendItem playerIdField;

    @javafx.fxml.FXML
    public void initialize() {
        incidentTypeCombo.getItems().addAll("Medical", "Fire", "Security", "Other");

        colId.setCellValueFactory(data -> data.getValue().incidentIdProperty());
        colType.setCellValueFactory(data -> data.getValue().incidentTypeProperty());
        colLocation.setCellValueFactory(data -> data.getValue().locationProperty());
        colDateTime.setCellValueFactory(data -> data.getValue().dateTimeProperty());
        colDetails.setCellValueFactory(data -> data.getValue().detailsProperty());

        emergencyTable.setItems(reportList);
    }
    @javafx.fxml.FXML
    void handleSearch(ActionEvent event) {
        String playerId = playerIdField.getText().trim();
        if (playerId.isEmpty()) {
            System.out.println("Please enter Player ID!");
            return;
        }
        System.out.println("Player ID: " + playerId);
    }

    @javafx.fxml.FXML
    public void handleSubmit(ActionEvent actionEvent) {
        String id = incidentIdField.getText().isEmpty() ? "INC-" + (reportList.size() + 1) : incidentIdField.getText();
        String type = incidentTypeCombo.getValue();
        String location = locationField.getText();
        LocalDate date = incidentDatePicker.getValue();
        String time = incidentTimeField.getText();
        //String details = detailsArea.getText();

        if(type == null || location.isEmpty() || date == null || time.isEmpty() ) {
            showAlert("Error", "Please fill in all fields!");
            return;
        }

        String dateTime = date.toString() + " " + time;


        String details;
        boolean duplicate = reportList.stream().anyMatch(r ->
                r.getIncidentType().equals(type) &&
                        r.getLocation().equals(location)
                        //r.getDetails().equals(details)
        );
        if(duplicate) {
            showAlert("Duplicate Report", "A similar incident already exists!");
            return;
        }

        reportList.add(new EmergencyReport14(id, type, location, dateTime, time));
        clearForm();;

    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        clearForm();
    }

    private void clearForm() {
        incidentIdField.clear();
        incidentTypeCombo.setValue(null);
        locationField.clear();
        incidentDatePicker.setValue(null);
        incidentTimeField.clear();
        //detailsArea.clear();
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}