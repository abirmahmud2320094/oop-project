package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.util.HashMap;
import java.util.Map;


public class CoachCommunicationController
{
    @javafx.fxml.FXML
    private ComboBox<String> playerCombo;
    @javafx.fxml.FXML
    private TextArea messageArea;
    @javafx.fxml.FXML
    private AnchorPane statsLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    private Map<String, String> playerCoachMap = new HashMap<>();

    @javafx.fxml.FXML
    public void initialize() {
        playerCoachMap.put("Player1", "Coach A");
        playerCoachMap.put("Player2", "Coach B");
        playerCoachMap.put("Player3", "Coach A");
        playerCoachMap.put("Player4", "Coach A");
        playerCoachMap.put("Player5", "Coach A");
        playerCoachMap.put("Player6", "Coach A");

        playerCombo.getItems().addAll(playerCoachMap.keySet());
    }

    @javafx.fxml.FXML
    public void ClearOnAction(ActionEvent actionEvent) {
        playerCombo.setValue(null);
        messageArea.clear();
        statusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void SendOnAction(ActionEvent actionEvent) {
        String player = playerCombo.getValue();
        String message = messageArea.getText().trim();

        if (player == null || message.isEmpty()) {
            statusLabel.setText("Please select a player and write a message!");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }


        String coach = playerCoachMap.get(player);
        if (coach == null) {
            statusLabel.setText("No coach assigned to selected player!");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }


        System.out.println("Message to " + coach + " about " + player + ": " + message);


        statusLabel.setText("Message sent to " + coach + "!");
        statusLabel.setStyle("-fx-text-fill: green;");
    }

    public Map<String, String> getPlayerCoachMap() {
        return playerCoachMap;
    }

    public void setPlayerCoachMap(Map<String, String> playerCoachMap) {
        this.playerCoachMap = playerCoachMap;
    }
}