package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public class RecoveryTracker16 {
    private final String playerName;
    private final String notes;
    private final int progressScore;

    public RecoveryTracker16(String playerName, String notes, int progressScore) {
        this.playerName = playerName;
        this.notes = notes;
        this.progressScore = progressScore;
    }

    public String getPlayerName() { return playerName; }
    public String getNotes() { return notes; }
    public int getProgressScore() { return progressScore; }
}
