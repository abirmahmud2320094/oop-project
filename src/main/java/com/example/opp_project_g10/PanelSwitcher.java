package com.example.opp_project_g10;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class PanelSwitcher {
    public static void switchPanel(AnchorPane targetPane, String fxmlFileName) {
        try {
            Pane newLoadedPane = FXMLLoader.load(PanelSwitcher.class.getResource(fxmlFileName + ".fxml"));
            targetPane.getChildren().setAll(newLoadedPane);

            double centerX = (targetPane.getWidth() - newLoadedPane.getPrefWidth()) / 2;
            double centerY = (targetPane.getHeight() - newLoadedPane.getPrefHeight()) / 2;

            newLoadedPane.setLayoutX(centerX);
            newLoadedPane.setLayoutY(centerY);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
