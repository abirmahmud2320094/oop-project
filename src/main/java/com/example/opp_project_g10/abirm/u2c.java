package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class u2c {

    @javafx.fxml.FXML
    private DatePicker eventDP;
    @javafx.fxml.FXML
    private TextArea teamsTA;
    @javafx.fxml.FXML
    private Label errorlabel;
    @javafx.fxml.FXML
    private CheckBox securitypersonnelCB;
    @javafx.fxml.FXML
    private CheckBox lightingsystemCHB;
    @javafx.fxml.FXML
    private CheckBox soundsystemCHB;
    @javafx.fxml.FXML
    private ComboBox<String> selectevencombobox;

    @javafx.fxml.FXML
    public void initialize() {
        selectevencombobox.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
    }

    @javafx.fxml.FXML
    public void savechangesBUTTONonAction(ActionEvent actionEvent) {
        if (eventDP.getValue() == null) {
            errorlabel.setText("Please select an event date!");
            return;
        }

        String event = selectevencombobox.getValue();
        if (event == null || event.isEmpty()) {
            errorlabel.setText("Please select an event!");
            return;
        }

        String teams = teamsTA.getText();
        boolean sound = soundsystemCHB.isSelected();
        boolean lighting = lightingsystemCHB.isSelected();
        boolean security = securitypersonnelCB.isSelected();

        // Demo message
        errorlabel.setText("Changes saved for " + event + " on " + eventDP.getValue() +
                "\nTeams: " + teams +
                "\nSound: " + sound + ", Lighting: " + lighting + ", Security: " + security);
    }
}
