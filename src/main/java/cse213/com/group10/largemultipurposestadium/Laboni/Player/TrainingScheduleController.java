package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrainingScheduleController {

    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule, String> DateColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule, String> TimeColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule, String> LocationColumn;
    @javafx.fxml.FXML
    private TableColumn<TrainingSchedule, String> CoachColumn;
    @javafx.fxml.FXML
    private TableView<TrainingSchedule> ScheduleTable;

    @javafx.fxml.FXML
    public void initialize() {

        DateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        TimeColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        LocationColumn.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        CoachColumn.setCellValueFactory(cellData -> cellData.getValue().coachProperty());


        ObservableList<TrainingSchedule> schedule = FXCollections.observableArrayList(
                new TrainingSchedule("2025-08-16", "10:00 AM", "Gym A", "Coach John"),
                new TrainingSchedule("2025-08-17", "2:00 PM", "Field B", "Coach Mary"),
                new TrainingSchedule("2025-08-17", "1:00 PM", "Field C", "Coach Sakib"),
                new TrainingSchedule("2025-08-18", "2:00 PM", "Field D", "Coach Hassan"),
                new TrainingSchedule("2025-08-18", "2:00 PM", "Field B", "Coach Liton"),
                new TrainingSchedule("2025-08-19", "2:00 PM", "Field B", "Coach Hridoy")
        );

        ScheduleTable.setItems(schedule);
    }
}

