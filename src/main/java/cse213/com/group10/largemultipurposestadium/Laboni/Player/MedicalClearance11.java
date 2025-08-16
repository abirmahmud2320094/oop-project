package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public class MedicalClearance11 {
    private String playerId;
    private String status;  // "Fit" or "Unfit"
    private String remarks;

    public MedicalClearance11(String playerId, String status, String remarks) {
        this.playerId = playerId;
        this.status = status;
        this.remarks = remarks;
    }

    public String getPlayerId() { return playerId; }
    public String getStatus() { return status; }
    public String getRemarks() { return remarks; }

    public void setPlayerId(String playerId) { this.playerId = playerId; }
    public void setStatus(String status) { this.status = status; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
}
