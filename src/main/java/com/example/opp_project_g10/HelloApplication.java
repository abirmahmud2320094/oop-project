package com.example.opp_project_g10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage1) throws IOException {
        SceneSwitcher.stage=stage1;
        stage=stage1;
        File file = new File("Data/users.bin");


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Simulation Operation Of Multipurpose Stadium.");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getPrimaryStage() {
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}