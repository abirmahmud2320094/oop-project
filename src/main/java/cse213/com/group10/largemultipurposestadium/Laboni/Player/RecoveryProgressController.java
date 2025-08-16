package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class RecoveryProgressController {

    @javafx.fxml.FXML
    private LineChart<String, Number> recoveryChart;

    @javafx.fxml.FXML
    private NumberAxis percentageAxis;

    @javafx.fxml.FXML
    private CategoryAxis dateAxis;

    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        try {

            percentageAxis.setLabel("Recovery %");
            percentageAxis.setAutoRanging(false);
            percentageAxis.setLowerBound(0);
            percentageAxis.setUpperBound(100);
            percentageAxis.setTickUnit(10);

            dateAxis.setLabel("Date");


            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName("Recovery Progress");

            series.getData().add(new XYChart.Data<>("Day 1", 20));
            series.getData().add(new XYChart.Data<>("Day 3", 40));
            series.getData().add(new XYChart.Data<>("Day 5", 60));
            series.getData().add(new XYChart.Data<>("Day 7", 80));
            series.getData().add(new XYChart.Data<>("Day 10", 95));

            recoveryChart.getData().clear();
            recoveryChart.getData().add(series);

            errorLabel.setText("");
        } catch (Exception e) {
            errorLabel.setText("Error loading recovery data!");
            e.printStackTrace();
        }
    }
}
