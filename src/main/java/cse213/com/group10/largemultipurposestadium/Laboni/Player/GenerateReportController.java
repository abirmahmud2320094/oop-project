package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.print.PrinterJob;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileOutputStream;


public class GenerateReportController
{
    @javafx.fxml.FXML
    private TextArea reportTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> playerCombo;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCombo;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeCombo.getItems().addAll("Fitness", "Injury", "Summary");

        playerCombo.getItems().addAll("Player1", "Player2", "Team A");
    }


    @javafx.fxml.FXML
    public void handleGenerate(ActionEvent actionEvent) {
        String selectedPlayerTeam = playerCombo.getValue();
        String reportType = reportTypeCombo.getValue();

        if(selectedPlayerTeam == null || reportType == null) {
            reportTextArea.setText("Please select Player/Team and Report Type!");
            return;
        }

        String reportData = "Report for " + selectedPlayerTeam + "\nType: " + reportType + "\n\n";
        reportData += "Sample Data:\n";

        if(reportType.equals("Fitness")) reportData += "Fitness Score: 85\n";
        else if(reportType.equals("Injury")) reportData += "Injury History: None\n";
        else if(reportType.equals("Summary")) reportData += "Fitness: 85\nInjury: None\nClearance: Fit\n";

        reportTextArea.setText(reportData);
    }
    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        playerCombo.setValue(null);
        reportTypeCombo.setValue(null);
        reportTextArea.clear();

    }
    @javafx.fxml.FXML
    public void handleExportPDF(ActionEvent actionEvent) {
        String content = reportTextArea.getText();
        if(content.isEmpty()) return;

        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialFileName("PlayerReport.pdf");
            File file = fileChooser.showSaveDialog(reportTextArea.getScene().getWindow());
            if(file == null) return;


            System.out.println("PDF exported: " + file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @javafx.fxml.FXML
    public void handlePrint(ActionEvent event) {
        PrinterJob job = PrinterJob.createPrinterJob();
        if(job != null && job.showPrintDialog(reportTextArea.getScene().getWindow())) {
            boolean success = job.printPage(reportTextArea);
            if(success) job.endJob();
            }
        }
    }
