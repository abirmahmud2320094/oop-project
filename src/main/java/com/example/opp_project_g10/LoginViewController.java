package com.example.opp_project_g10;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LoginViewController
{
    @javafx.fxml.FXML
    private PasswordField password_PF;
    @javafx.fxml.FXML
    private ComboBox<String> userType_CB;
    @javafx.fxml.FXML
    private CheckBox showPassword_CB;
    @javafx.fxml.FXML
    private TextField email_TF;
    @javafx.fxml.FXML
    private Label showPassword_L;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginContinue_OA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Abid/DashBoard");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void showPassword_OA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signUp_OA(ActionEvent actionEvent) {
    }
}