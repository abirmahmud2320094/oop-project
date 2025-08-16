package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;

public class RecoveryProgress {
    private LocalDate assessmentDate;
    private double recoveryPercentage;
    private String notes;

    // Constructor
    public RecoveryProgress(LocalDate assessmentDate, double recoveryPercentage, String notes) {
        this.assessmentDate = assessmentDate;
        this.recoveryPercentage = recoveryPercentage;
        this.notes = notes;
    }

    // Getters and Setters
    public LocalDate getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(LocalDate assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public double getRecoveryPercentage() {
        return recoveryPercentage;
    }

    public void setRecoveryPercentage(double recoveryPercentage) {
        this.recoveryPercentage = recoveryPercentage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Formatted date for display purposes
    public String getFormattedDate() {
        return assessmentDate.format(java.time.format.DateTimeFormatter.ofPattern("MMM dd, yyyy"));
    }

    @Override
    public String toString() {
        return "RecoveryProgress{" +
                "assessmentDate=" + assessmentDate +
                ", recoveryPercentage=" + recoveryPercentage +
                ", notes='" + notes + '\'' +
                '}';
    }
}
