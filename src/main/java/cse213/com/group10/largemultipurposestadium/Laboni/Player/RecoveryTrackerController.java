package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.chart.*;
import javafx.event.ActionEvent;

import java.util.*;

public class RecoveryTrackerController {

    @javafx.fxml.FXML
    private ComboBox<String> playerCombo;
    @javafx.fxml.FXML
    private TextArea notesArea;
    @javafx.fxml.FXML
    private TextField progressField;
    @javafx.fxml.FXML
    private LineChart<Number, Number> recoveryChart;
    @javafx.fxml.FXML
    private TextArea summaryArea;


    private final Map<String, List<Integer>> progressData = new HashMap<>();

    @javafx.fxml.FXML
    public void initialize() {

        playerCombo.getItems().addAll(
                "John Smith", "David Rahman", "Sakib Hasan",
                "Michael Lee", "Player5", "Player6", "Player7"
        );

        recoveryChart.setTitle("Recovery Progress");
        recoveryChart.getXAxis().setLabel("Check-in");
        recoveryChart.getYAxis().setLabel("Progress Score");
    }

    @javafx.fxml.FXML
    public void handleUpdateProgress(ActionEvent event) {
        String player = playerCombo.getValue();
        String notes = notesArea.getText().trim();
        String progressText = progressField.getText().trim();

        if (player == null || player.isEmpty() || notes.isEmpty() || progressText.isEmpty()) {
            showAlert("Error", "Please select player, enter recovery notes, and progress score!");
            return;
        }

        int score;
        try {
            score = Integer.parseInt(progressText);
            if (score < 0 || score > 100) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            showAlert("Error", "Progress score must be a number between 0 and 100.");
            return;
        }

        progressData.putIfAbsent(player, new ArrayList<>());
        progressData.get(player).add(score);

        updateChart(player);
        updateSummary(player, notes);

        progressField.clear();
        notesArea.clear();
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent event) {
        playerCombo.setValue(null);
        notesArea.clear();
        progressField.clear();
        summaryArea.clear();
        recoveryChart.getData().clear();
    }

    private void updateChart(String player) {
        recoveryChart.getData().clear();

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName(player);

        List<Integer> scores = progressData.get(player);
        if (scores != null) {
            for (int i = 0; i < scores.size(); i++) {
                series.getData().add(new XYChart.Data<>(i + 1, scores.get(i)));
            }
        }

        recoveryChart.getData().add(series);
        recoveryChart.getData().clear();
    }

    private void updateSummary(String player, String notes) {
        List<Integer> scores = progressData.get(player);
        int latestScore = scores.get(scores.size() - 1);
        String trend = "Stable";
        if (scores.size() > 1) {
            int previousScore = scores.get(scores.size() - 2);
            if (latestScore > previousScore) trend = "Improving";
            else if (latestScore < previousScore) trend = "Declining";
        }

        summaryArea.setText(
                "Player: " + player +
                        "\nLatest Score: " + latestScore +
                        "\nTrend: " + trend +
                        "\nNotes: " + notes
        );
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

