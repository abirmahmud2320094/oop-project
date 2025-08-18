package com.example.opp_project_g10.abirm;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class u3c {

    @javafx.fxml.FXML
    private ComboBox<String> chooseeventCB;
    @javafx.fxml.FXML
    private CheckBox generalAudienceCHB;
    @javafx.fxml.FXML
    private TextArea setZoneRestrictionsTA;
    @javafx.fxml.FXML
    private CheckBox staffServiceZoneCHB;
    @javafx.fxml.FXML
    private CheckBox pressZonCHB;
    @javafx.fxml.FXML
    private Label confirmationorvalidationmessageLabiel;

    @javafx.fxml.FXML
    public void initialize() {
        chooseeventCB.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
    }

    @javafx.fxml.FXML
    public void confirmZonePlanButtonAction(ActionEvent actionEvent) {
        String event = chooseeventCB.getValue();
        if (event == null || event.isEmpty()) {
            confirmationorvalidationmessageLabiel.setText("Please select an event!");
            return;
        }

        boolean general = generalAudienceCHB.isSelected();
        boolean staff = staffServiceZoneCHB.isSelected();
        boolean press = pressZonCHB.isSelected();
        String restrictions = setZoneRestrictionsTA.getText();

        // Demo message
        confirmationorvalidationmessageLabiel.setText("Zone plan confirmed for " + event +
                "\nGeneral: " + general + ", Staff: " + staff + ", Press: " + press +
                "\nRestrictions: " + restrictions);
    }
}
