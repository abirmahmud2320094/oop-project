package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class LoginController {

    @javafx.fxml.FXML private TextField usernameField;
    @javafx.fxml.FXML private PasswordField passwordField;
    @javafx.fxml.FXML private ComboBox<String> userTypeBox;

    private final List<user> users = List.of(
            new user(1, "player", "player123", "John Doe", user.UserType.PLAYER),
            new user(2, "medical", "medical123", "Dr. Smith", user.UserType.MEDICAL_STAFF)
    );

    @javafx.fxml.FXML
    public void initialize() {
        userTypeBox.getItems().addAll("Player", "Medical Staff");
        userTypeBox.getSelectionModel().selectFirst();
    }

    @javafx.fxml.FXML
    private void handleLogin() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();
        String selectedType = userTypeBox.getValue();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Login Error", "Username and password are required");
            return;
        }

        user loggedInUser = users.stream()
                .filter(u -> u.getUsername().equals(username) &&
                        u.getPassword().equals(password) &&
                        ((u.isPlayer() && selectedType.equals("Player")) ||
                                (u.isMedicalStaff() && selectedType.equals("Medical Staff"))))
                .findFirst()
                .orElse(null);

        if (loggedInUser == null) {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid credentials for " + selectedType);
            return;
        }

        String dashboardFXML = ((user) loggedInUser).isPlayer()
                ? "/fxml/Laboni/Player/PlayerDashboard.fxml"
                : "/fxml/Laboni/Player/MedicalStaffDashboard.fxml";

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(dashboardFXML));
            Parent root = loader.load();

            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle(selectedType + " Dashboard");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load dashboard!");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
