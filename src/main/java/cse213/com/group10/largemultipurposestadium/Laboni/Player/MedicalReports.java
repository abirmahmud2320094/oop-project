package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MedicalReports {
    private final StringProperty type;
    private final StringProperty date;
    private final StringProperty summary;
    private final StringProperty details;

    public MedicalReports(String type, String date, String summary, String details) {
        this.type = new SimpleStringProperty(type);
        this.date = new SimpleStringProperty(date);
        this.summary = new SimpleStringProperty(summary);
        this.details = new SimpleStringProperty(details);
    }

    public StringProperty typeProperty() { return type; }
    public StringProperty dateProperty() { return date; }
    public StringProperty summaryProperty() { return summary; }
    public StringProperty detailsProperty() { return details; }

    public String getType() { return type.get(); }
    public String getDate() { return date.get(); }
    public String getSummary() { return summary.get(); }
    public String getDetails() { return details.get(); }
}