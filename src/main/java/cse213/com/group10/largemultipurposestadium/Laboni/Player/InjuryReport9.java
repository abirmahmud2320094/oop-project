package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;

public class InjuryReport9
{
    private final String playerId;
    private final String injuryType;
    private final LocalDate date;
    private final String remarks;

    public InjuryReport9(String playerId, String injuryType, LocalDate date, String remarks) {
        this.playerId = playerId;
        this.injuryType = injuryType;
        this.date = date;
        this.remarks = remarks;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getInjuryType() {
        return injuryType;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getRemarks() {
        return remarks;
    }
}
