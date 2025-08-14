package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public class FitnessReport {
    private final String weight;
    private final String sleepHours;
    private final String injuryNotes;

    public FitnessReport(String weight, String sleepHours, String injuryNotes) {
        this.weight = weight;
        this.sleepHours = sleepHours;
        this.injuryNotes = injuryNotes;
    }
    public String getWeight() {
        return this.weight;
    }

    public String getSleepHours() {
        return sleepHours;
    }

    public String getInjuryNotes() {
        return injuryNotes;
    }



}

