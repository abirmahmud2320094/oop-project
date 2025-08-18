package com.example.opp_project_g10.abirm;

import com.example.opp_project_g10.abirm.modelClass.Event;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class u1c {

    @javafx.fxml.FXML
    private TableColumn<Event, String> noteTableColumn;
    @javafx.fxml.FXML
    private TextField noteTF;
    @javafx.fxml.FXML
    private CheckBox soundSystemCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Event, LocalDate> eventDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker eventDateDP;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventNameTableColumn;
    @javafx.fxml.FXML
    private TableView<Event> eventTableView;
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private CheckBox lightingSystemCheckBox;
    @javafx.fxml.FXML
    private CheckBox securityPersonnelCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Event, String> ARRTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Event, String> eventTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectEventTypeComboBox;
    @javafx.fxml.FXML
    private Label errormessagesLabel;

    ArrayList<Event> eventList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectEventTypeComboBox.setItems(FXCollections.observableArrayList("Joti", "Abir", "Hashid"));

        eventNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        eventTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        ARRTableColumn.setCellValueFactory(new PropertyValueFactory<>("ARR"));
        noteTableColumn.setCellValueFactory(new PropertyValueFactory<>("note"));
    }

    @javafx.fxml.FXML
    public void confirmScheduleOnActionButton(ActionEvent actionEvent) {
        String name = eventNameTextField.getText();
        String type = selectEventTypeComboBox.getValue();
        LocalDate date = eventDateDP.getValue();
        String note = noteTF.getText();

        boolean sound = soundSystemCheckBox.isSelected();
        boolean lighting = lightingSystemCheckBox.isSelected();
        boolean security = securityPersonnelCheckBox.isSelected();

        if (name.isEmpty() || type == null || date == null) {
            errormessagesLabel.setText("⚠ Please fill event name, type, and date!");
            return;
        }

        Event e = new Event(name, type, date, sound, lighting, security, note);
        eventList.add(e);
        eventTableView.getItems().clear();
        eventTableView.getItems().addAll(eventList);

        errormessagesLabel.setText("Event scheduled: " + name);
    }
}
