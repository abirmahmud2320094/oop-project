package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TrainingSchedule {
    private final StringProperty date;
    private final StringProperty time;
    private final StringProperty location;
    private final StringProperty coach;

    public TrainingSchedule(String date, String time, String location, String coach) {
        this.date = new SimpleStringProperty(date);
        this.time = new SimpleStringProperty(time);
        this.location = new SimpleStringProperty(location);
        this.coach = new SimpleStringProperty(coach);
    }

    public StringProperty dateProperty() { return date; }
    public StringProperty timeProperty() { return time; }
    public StringProperty locationProperty() { return location; }
    public StringProperty coachProperty() { return coach; }

    public String getDate() { return date.get(); }
    public String getTime() { return time.get(); }
    public String getLocation() { return location.get(); }
    public String getCoach() { return coach.get(); }
}