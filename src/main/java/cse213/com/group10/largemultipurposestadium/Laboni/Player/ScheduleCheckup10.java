package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;

public class ScheduleCheckup10 {
    private LocalDate date;
    private String type;
    private String doctorName;

    public ScheduleCheckup10(LocalDate date, String type, String doctorName) {
        this.date = date;
        this.type = type;
        this.doctorName = doctorName;
    }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    @Override
    public String toString() {
        return "Checkup on " + date + " (" + type + ") with " + doctorName;
    }
}
