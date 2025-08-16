package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class EditProfileController
{
    @javafx.fxml.FXML
    private TextField fullNameField;
    @javafx.fxml.FXML
    private ImageView profileImageView;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private TextField emergencyField;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField phoneField;

    private static final String DEFAULT_AVATAR = "/images/default_avatar.png";


    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10,15}$");


    @javafx.fxml.FXML
    public void initialize() {
        try {
            Image defaultImage = new Image(getClass().getResourceAsStream(DEFAULT_AVATAR));
            profileImageView.setImage(defaultImage);
        } catch (Exception e) {
            System.err.println("Could not load default profile image: " + e.getMessage());
        }

        loadUserData();
    }

    private void loadUserData() {

        fullNameField.setText("John Doe");
        emailField.setText("john.doe@example.com");
        phoneField.setText("1234567890");
        emergencyField.setText("Jane Doe (9876543210)");
    }

    @javafx.fxml.FXML
    public void handleUploadPicture(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Profile Picture");

        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        File file = fileChooser.showOpenDialog(((Node) actionEvent.getSource()).getScene().getWindow());

        if (file != null) {
            try {

                Image image = new Image(file.toURI().toString());
                profileImageView.setImage(image);
                statusLabel.setText("Profile picture updated!");
                statusLabel.setTextFill(Color.GREEN);
            } catch (Exception e) {
                statusLabel.setText("Error loading image: " + e.getMessage());
                statusLabel.setTextFill(Color.RED);
            }
        }
    }

    @javafx.fxml.FXML
    public void handleSave(ActionEvent actionEvent) {

        if (fullNameField.getText().trim().isEmpty()) {
            showStatus("Full name is required", true);
            return;
        }

        if (!isValidEmail(emailField.getText().trim())) {
            showStatus("Please enter a valid email address", true);
            return;
        }

        if (!isValidPhone(phoneField.getText().trim())) {
            showStatus("Phone number must be 10-15 digits", true);
            return;
        }

        if (emergencyField.getText().trim().isEmpty()) {
            showStatus("Emergency contact is required", true);
            return;
        }


        showStatus("Profile updated successfully!", false);


    }

    @FXML
    public void handleClear(ActionEvent actionEvent) {

        loadUserData();
        statusLabel.setText("Fields reset to original values");
        statusLabel.setTextFill(Color.BLUE);

        try {
            Image defaultImage = new Image(getClass().getResourceAsStream(DEFAULT_AVATAR));
            profileImageView.setImage(defaultImage);
        } catch (Exception e) {
            System.err.println("Could not load default profile image: " + e.getMessage());
        }
    }

    @FXML
    public void handleBack(ActionEvent actionEvent) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("PlayerDashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Player Dashboard");
        } catch (IOException e) {
            showStatus("Error loading dashboard: " + e.getMessage(), true);
        }
    }

    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    private boolean isValidPhone(String phone) {
        return PHONE_PATTERN.matcher(phone).matches();
    }

    private void showStatus(String message, boolean isError) {
        statusLabel.setText(message);
        statusLabel.setTextFill(isError ? Color.RED : Color.GREEN);
    }
}