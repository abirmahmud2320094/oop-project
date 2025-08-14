package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

//import static java.util.stream.Nodes.collect;

public class MatchFixtureController {
    @javafx.fxml.FXML
    private TableView<MatchFixture> matchTable;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> timeColumn;
    @javafx.fxml.FXML
    private Button filterBtn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> opponentColumn;
    @javafx.fxml.FXML
    private TextField opponentFilter;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> competitionColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<MatchFixture, String> venueColumn;
    @javafx.fxml.FXML
    private ComboBox<String> competitionFilter;
    @javafx.fxml.FXML
    private DatePicker dateFilter;

    private final ObservableList<MatchFixture> allFixtures = FXCollections.observableArrayList();

    private static MatchFixture call(TableColumn.CellDataFeatures<MatchFixture, String> data) {
        return data.getValue();
    }

    @javafx.fxml.FXML
    public void initialize() {
        allFixtures.addAll(
        );
        
        competitionFilter.getItems().add("All");
        competitionFilter.getItems().addAll(
                allFixtures.stream()
                        .map(MatchFixture::getCompetition)
                        .toList() //distinct()collect(Collectors.toList())
        );
        competitionFilter.getSelectionModel().select("All");

        matchTable.setItems(allFixtures);
    }

    @javafx.fxml.FXML
    public void filterMatches(ActionEvent actionEvent) {
        String selectedCompetition = competitionFilter.getValue();
        String opponentSearch = opponentFilter.getText().toLowerCase();
        LocalDate selectedDate = dateFilter.getValue();


        //ObservableList<MatchFixture> filtered;
        //matchTable.setItems(filtered);
        ObservableList<MatchFixture> filtered = FXCollections.observableArrayList();


        matchTable.setItems(filtered);
    }
}