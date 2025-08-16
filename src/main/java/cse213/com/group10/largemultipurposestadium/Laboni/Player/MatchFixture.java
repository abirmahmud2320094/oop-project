package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public class MatchFixture {
    private String date;
    private String time;
    private String opponent;
    private String competition;
    private String venue;

    public MatchFixture(String date, String time, String opponent, String competition, String venue) {
        this.date = date;
        this.time = time;
        this.opponent = opponent;
        this.competition = competition;
        this.venue = venue;
    }

    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getOpponent() { return opponent; }
    public String getCompetition() { return competition; }
    public String getVenue() { return venue; }
}
