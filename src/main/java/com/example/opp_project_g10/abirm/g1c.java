package com.example.opp_project_g10.abirm;

import com.example.opp_project_g10.abirm.modelClass.Ticket;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class g1c {

    @javafx.fxml.FXML
    private TextField seatRangeEndField;
    @javafx.fxml.FXML
    private TextField studentPriceField;
    @javafx.fxml.FXML
    private CheckBox regularCheckBox;
    @javafx.fxml.FXML
    private TextField regularPriceField;
    @javafx.fxml.FXML
    private TextField vipPriceField;
    @javafx.fxml.FXML
    private TextField seatRangeStartField;
    @javafx.fxml.FXML
    private CheckBox studentCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> eventComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private CheckBox vipCheckBox;

    // simple list for tickets
    ArrayList<Ticket> ticketList = new ArrayList<>();

    @FXML
    public void initialize() {
        // sample events in ComboBox
        eventComboBox.setItems(FXCollections.observableArrayList("Concert", "Football", "Drama"));
    }

    @FXML
    public void publishButtonOA(ActionEvent actionEvent) {
        String eventName = eventComboBox.getValue();
        String startSeat = seatRangeStartField.getText();
        String endSeat = seatRangeEndField.getText();

        double vip = 0, reg = 0, stu = 0;

        if (vipCheckBox.isSelected()) {
            vip = Double.parseDouble(vipPriceField.getText());
        }
        if (regularCheckBox.isSelected()) {
            reg = Double.parseDouble(regularPriceField.getText());
        }
        if (studentCheckBox.isSelected()) {
            stu = Double.parseDouble(studentPriceField.getText());
        }

        Ticket t = new Ticket(eventName, startSeat, endSeat, vip, reg, stu);
        ticketList.add(t);

        statusLabel.setText("Saved ticket for " + eventName + " | Seats " + startSeat + "-" + endSeat);
    }
}
