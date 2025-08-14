package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PerformanceFeedback {
    private final StringProperty event;
    private final StringProperty coach;
    private final StringProperty feedback;
    private final StringProperty date;


    public PerformanceFeedback(String event, String coach, String feedback, String date) {
        this.event = new SimpleStringProperty(event);
        this.coach = new SimpleStringProperty(coach);
        this.feedback = new SimpleStringProperty(feedback);
        this.date = new SimpleStringProperty(date);
    }

    public StringProperty eventProperty() { return event; }
    public StringProperty coachProperty() { return coach; }
    public StringProperty feedbackProperty() { return feedback; }
    public StringProperty dateProperty() { return date; }
}
