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

public class PlayerDashboardController {

    @javafx.fxml.FXML private AnchorPane contentArea;


    private final Map<String, Parent> fxmlCache = new HashMap<>();
    private String currentView = "";

    @javafx.fxml.FXML
    public void initialize() {

        loadFXML(" Summary.fxml");
    }


    private void loadFXML(String fxmlFile) {
        try {

            Parent root = fxmlCache.get(fxmlFile);

            if (root == null) {

                root = FXMLLoader.load(Objects.requireNonNull(
                        getClass().getResource(fxmlFile)
                ));
                fxmlCache.put(fxmlFile, root);
            }


            contentArea.getChildren().setAll(root);
            currentView = fxmlFile;


            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);

        } catch (IOException | NullPointerException e) {
            showAlert("Error loading view: " + fxmlFile);
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    private void TrainingSessionOnAction(ActionEvent actionEvent) {
        loadFXML("TrainingSession.fxml");
    }

    @javafx.fxml.FXML
    private void FitnessReportOnAction(ActionEvent actionEvent) {
        loadFXML("FitnessReport.fxml");
    }

    @javafx.fxml.FXML
    private void LeaveRequestOnAction(ActionEvent actionEvent) {
        loadFXML("LeaveRequest.fxml");
    }

    @javafx.fxml.FXML
    private void MatchFixturesOnAction(ActionEvent actionEvent) {
        loadFXML("MatchFixture.fxml");
    }

    @javafx.fxml.FXML
    private void PerformanceFeedbackOnAction(ActionEvent actionEvent) {
        loadFXML("RecoveryProgress.fxml");
    }

    @javafx.fxml.FXML
    private void RequestEquipmentOnAction(ActionEvent actionEvent) {
        loadFXML("RequestEquipment.fxml");
    }

    @javafx.fxml.FXML
    private void EditProfileOnAction(ActionEvent actionEvent) {
        loadFXML("EditProfile.fxml");
    }

    @javafx.fxml.FXML
    private void MedicalReportsOnAction(ActionEvent actionEvent) {
        loadFXML("MedicalRecords.fxml");
    }

    @javafx.fxml.FXML
    private void SignOutOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout Confirmation");
        alert.setHeaderText("Are you sure you want to sign out?");
        alert.setContentText("Any unsaved changes will be lost.");

        if (alert.showAndWait().orElse(null) == ButtonType.OK) {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(
                        getClass().getResource("/cse213/com/group10/largemultipurposestadium/Login.fxml")
                ));
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("Login");
            } catch (IOException e) {
                showAlert("Error loading login screen");
                e.printStackTrace();
            }
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}