package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmergencyReport14 {
    private final StringProperty incidentId;
    private final StringProperty incidentType;
    private final StringProperty location;
    private final StringProperty dateTime;
    private final StringProperty details;

    public EmergencyReport14(String IncidentId, String type, String location, String dateTime, String details) {
        this.incidentId = new SimpleStringProperty(IncidentId);
        this.incidentType = new SimpleStringProperty(type);
        this.location = new SimpleStringProperty(location);
        this.dateTime = new SimpleStringProperty(dateTime);
        this.details = new SimpleStringProperty(details);
    }


    public StringProperty incidentIdProperty() { return incidentId; }
    public StringProperty incidentTypeProperty() { return incidentType; }
    public StringProperty locationProperty() { return location; }
    public StringProperty dateTimeProperty() { return dateTime; }
    public StringProperty detailsProperty() { return details; }

    public String getIncidentType() { return incidentType.get(); }
    public String getLocation() { return location.get(); }
    public String getDetails() { return details.get(); }
}
