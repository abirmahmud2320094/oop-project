package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MatchFixtureController {

    @javafx.fxml.FXML
    private TableView<MatchFixture> matchTable;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> timeColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> opponentColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> competitionColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> venueColumn;

    @javafx.fxml.FXML
    private TextField VenueTF;
    @javafx.fxml.FXML
    private TextField TimeTF;
    @javafx.fxml.FXML
    private TextField opponentFilter;
    @javafx.fxml.FXML
    private ComboBox<String> competitionFilter;
    @javafx.fxml.FXML
    private DatePicker dateFilter;

    private ObservableList<MatchFixture> fixtureList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        dateColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDate()));
        timeColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getTime()));
        opponentColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getOpponent()));
        competitionColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCompetition()));
        venueColumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getVenue()));


        fixtureList.add(new MatchFixture("2025-08-20", "15:00", "Tigers FC", "League", "Main Stadium"));

        matchTable.setItems(fixtureList);

        competitionFilter.setItems(FXCollections.observableArrayList("League", "Friendly", "Cup"));
    }

    @javafx.fxml.FXML
    public void SubmitOA(ActionEvent actionEvent) {
        String date = dateFilter.getValue() != null ? dateFilter.getValue().toString() : "";
        String time = TimeTF.getText();
        String opponent = opponentFilter.getText();
        String competition = competitionFilter.getValue();
        String venue = VenueTF.getText();

        if (date.isEmpty() || time.isEmpty() || opponent.isEmpty() || competition == null || venue.isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Please fill all fields.").show();
            return;
        }

        fixtureList.add(new MatchFixture(date, time, opponent, competition, venue));


        dateFilter.setValue(null);
        TimeTF.clear();
        opponentFilter.clear();
        competitionFilter.setValue(null);
        VenueTF.clear();
    }
}
