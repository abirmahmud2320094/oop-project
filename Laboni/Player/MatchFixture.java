package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.value.ObservableValue;

import java.time.LocalDate;
import java.time.LocalTime;

public class MatchFixture {
    private String competition;
    private LocalDate date;
    private LocalTime time;
    private String venue;
    private String opponent;

    public MatchFixture(String competition, LocalDate date, LocalTime time, String venue, String opponent) {
        this.competition = competition;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.opponent = opponent;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }



}
