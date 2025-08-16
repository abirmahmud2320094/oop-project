package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MedicalStaffDashboardController {

    @FXML private AnchorPane contentArea;
    private final Map<String, Parent> fxmlCache = new HashMap<>();
    private static final String BASE_PATH = "/cse213/com/group10/largemultipurposestadium/Laboni/Player/";

    @FXML
    public void initialize() {
        loadCachedView("DashboardDefaultView.fxml");
    }

    private void loadCachedView(String fxmlFile) {
        try {
            Parent view = fxmlCache.computeIfAbsent(fxmlFile, file -> {
                try {
                    return FXMLLoader.load(Objects.requireNonNull(
                            getClass().getResource(BASE_PATH + file)
                    ));
                } catch (IOException | NullPointerException e) {
                    handleLoadError(file, e);
                    return null;
                }
            });

            if (view != null) {
                contentArea.getChildren().setAll(view);
                AnchorPane.setTopAnchor(view, 0.0);
                AnchorPane.setBottomAnchor(view, 0.0);
                AnchorPane.setLeftAnchor(view, 0.0);
                AnchorPane.setRightAnchor(view, 0.0);
            }
        } catch (Exception e) {
            handleLoadError(fxmlFile, e);
        }
    }

    private void handleLoadError(String fxmlFile, Exception e) {
        System.err.println("Error loading view: " + fxmlFile);
        e.printStackTrace();

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Loading Error");
        alert.setHeaderText("Cannot load view");
        alert.setContentText("Failed to load: " + fxmlFile + "\n\nError: " + e.getMessage());
        alert.showAndWait();
    }

    @FXML
    public void CoachCommunicationOA(ActionEvent event) {
        loadCachedView("CoachCommunication15.fxml");
    }

    @FXML
    public void MedicalClearanceOA(ActionEvent event) {
        loadCachedView("MedicalClearance11.fxml");
    }

    @FXML
    public void SignoutOA(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout Confirmation");
        alert.setHeaderText("Are you sure you want to sign out?");
        alert.setContentText("Any unsaved changes will be lost.");

        if (alert.showAndWait().orElse(ButtonType.CANCEL) == ButtonType.OK) {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(
                        getClass().getResource("/cse213/com/group10/largemultipurposestadium/Login.fxml")
                ));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("Stadium Login");
            } catch (IOException | NullPointerException e) {
                handleLoadError("Login.fxml", e);
            }
        }
    }

    @FXML
    public void EmergencyReportOA(ActionEvent event) {
        loadCachedView("EmergencyReport14.fxml");
    }

    @FXML
    public void RecoveryTrackerOA(ActionEvent event) {
        loadCachedView("RecoveryTracker16.fxml");
    }

    @FXML
    public void ScheduleCheckupOA(ActionEvent event) {
        loadCachedView("Schedule Checkup10.fxml");  // Fixed filename
    }

    @FXML
    public void InjuryReportsOA(ActionEvent event) {
        loadCachedView("InjuryReport9.fxml");
    }

    @FXML
    public void MedicineInventoryOA(ActionEvent event) {
        loadCachedView("MedicineInventory12.fxml");
    }

    @FXML
    public void GenerateReportOA(ActionEvent event) {
        loadCachedView("GenerateReport13.fxml");
    }
}