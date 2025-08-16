package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;

public class PerformanceFeedback {
    private String eventName;
    private LocalDate eventDate;
    private LocalDate feedbackDate;
    private String coachName;
    private String summary;
    private String status;
    private String playerResponse;

    public PerformanceFeedback(String eventName, LocalDate eventDate, LocalDate feedbackDate,
                               String coachName, String summary, String status) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.feedbackDate = feedbackDate;
        this.coachName = coachName;
        this.summary = summary;
        this.status = status;
        this.playerResponse = "";
    }

    // -------- Getters --------
    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public LocalDate getFeedbackDate() {
        return feedbackDate;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getSummary() {
        return summary;
    }

    public String getStatus() {
        return status;
    }

    public String getPlayerResponse() {
        return playerResponse;
    }

    // -------- Setters --------
    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlayerResponse(String playerResponse) {
        this.playerResponse = playerResponse;
    }

    @Override
    public String toString() {
        return summary; // ListView তে summary দেখানোর জন্য
    }

    }


