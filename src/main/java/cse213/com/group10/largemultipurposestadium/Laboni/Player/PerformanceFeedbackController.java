package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PerformanceFeedbackController {

    @javafx.fxml.FXML
    private ListView<String> feedbackListView;

    @javafx.fxml.FXML
    private Button handleSubmitResponse;

    @javafx.fxml.FXML
    private Label feedbackDateLabel;

    @javafx.fxml.FXML
    private TextArea responseTextArea;

    @javafx.fxml.FXML
    private Label coachNameLabel;

    @javafx.fxml.FXML
    private Label eventDateLabel;

    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    private Label eventNameLabel;

    private final ObservableList<String> feedbackData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        feedbackData.addAll(
                "Good performance, but improve stamina.",
                "Excellent teamwork!",
                "Need to focus on passing accuracy."
        );

        feedbackListView.setItems(feedbackData);

        feedbackListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                feedbackDateLabel.setText("2025-08-15");
                coachNameLabel.setText("Coach Rahim");
                eventDateLabel.setText("2025-08-10");
                eventNameLabel.setText("Practice Match");
                statusLabel.setText("Feedback loaded.");
            }
        });
    }

    @javafx.fxml.FXML
    public void handleSubmitResponse(ActionEvent actionEvent) {
        String response = responseTextArea.getText().trim();

        if (feedbackListView.getSelectionModel().getSelectedItem() == null) {
            statusLabel.setText("Please select a feedback first!");
            return;
        }

        if (response.isEmpty()) {
            statusLabel.setText("Response cannot be empty!");
        } else {
            statusLabel.setText("Response submitted successfully!");
            // TODO: Save response to DB or backend service
            responseTextArea.clear();
        }
    }

    @javafx.fxml.FXML
    public void handleClearResponse(ActionEvent actionEvent) {
        responseTextArea.clear();
        statusLabel.setText("Response cleared.");
    }
}
