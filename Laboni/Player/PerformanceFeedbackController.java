package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
//import jdk.internal.org.objectweb.asm.tree.InsnList;
//import jdk.internal.perf.PerfCounter;

public class PerformanceFeedbackController {
    @javafx.fxml.FXML
    private TableColumn<PerformanceFeedback, String> feedbackColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceFeedback, String> coachColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceFeedback, String> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceFeedback, String> eventColumn;
    @javafx.fxml.FXML
    private TableView<PerformanceFeedback> feedbackTable;

    @javafx.fxml.FXML
    public void initialize() {
        eventColumn.setCellValueFactory(data -> data.getValue().eventProperty());
        coachColumn.setCellValueFactory(data -> data.getValue().coachProperty());
        feedbackColumn.setCellValueFactory(data -> data.getValue().feedbackProperty());
        dateColumn.setCellValueFactory(data -> data.getValue().dateProperty());


        ObservableList<PerformanceFeedback> feedbackList = null;
        feedbackTable.setItems(null);

    }

    @javafx.fxml.FXML
    public void CheckFeedbackOnAction(ActionEvent actionEvent) {

        feedbackTable.getItems().add(
                new PerformanceFeedback("Friendly Match", "Coach Karim", "Strong defense, work on attack.", "2025-08-20")
        );
    }
}