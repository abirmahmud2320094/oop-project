package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
public class TrainingSession {
    private final SimpleStringProperty date;
    private final SimpleStringProperty time;
    private final SimpleStringProperty location;
    private final SimpleStringProperty coach;

    public TrainingSession(String date, String time, String location, String coach) {
        this.date = new SimpleStringProperty(date);
        this.time = new SimpleStringProperty(time);
        this.location = new SimpleStringProperty(location);
        this.coach = new SimpleStringProperty(coach);
    }

    public String getDate() {
        return date.get();
    }

    public void setDate(String value) {
        date.set(value);
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(String value) {
        time.set(value);
    }

    public String getLocation() {
        return location.get();
    }

    public void setLocation(String value) {
        location.set(value);
    }

    public String getCoach() {
        return coach.get();
    }

    public void setCoach(String value) {
        coach.set(value);
    }
}

