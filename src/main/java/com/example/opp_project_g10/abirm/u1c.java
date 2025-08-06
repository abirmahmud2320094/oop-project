package com.example.opp_project_g10.abirm;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class u1c
{
    @javafx.fxml.FXML
    private TableColumn<event, String> noteTableColumn;
    @javafx.fxml.FXML
    private TextField noteTF;
    @javafx.fxml.FXML
    private CheckBox soundSystemCheckBox;
    @javafx.fxml.FXML
    private TableColumn<event, LocalDate> eventDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker eventDateDP;
    @javafx.fxml.FXML
    private TableColumn<event, String> eventNameTableColumn;
    @javafx.fxml.FXML
    private TableView<event> eventTableView;
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private CheckBox lightingSystemCheckBox;
    @javafx.fxml.FXML
    private CheckBox securityPersonnelCheckBox;
    @javafx.fxml.FXML
    private TableColumn<event, String> ARRTableColumn;
    @javafx.fxml.FXML
    private TableColumn<event, String> eventTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectEventTypeComboBox;
    @javafx.fxml.FXML
    private Label errormessagesLabel;

    @javafx.fxml.FXML
    public void initialize() {

        selectEventTypeComboBox.getItems().addAll("Joti", "Abir", "hashid");


    }

    @javafx.fxml.FXML
    public void confirmScheduleOnActionButton(ActionEvent actionEvent) {
    }
}