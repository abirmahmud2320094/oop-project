package com.example.opp_project_g10.abirm.modelClass;

import java.time.LocalDate;

public class Event {

    private String eventName;
    private String eventType;
    private LocalDate eventDate;

    private boolean lightingRequired;
    private boolean soundRequired;
    private boolean securityRequired;

    private String resourceNotes;

    public Event() {
    }

    public Event(String eventName, String eventType, LocalDate eventDate, boolean lightingRequired, boolean soundRequired, boolean securityRequired, String resourceNotes) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.lightingRequired = lightingRequired;
        this.soundRequired = soundRequired;
        this.securityRequired = securityRequired;
        this.resourceNotes = resourceNotes;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public boolean isLightingRequired() {
        return lightingRequired;
    }

    public void setLightingRequired(boolean lightingRequired) {
        this.lightingRequired = lightingRequired;
    }

    public boolean isSoundRequired() {
        return soundRequired;
    }

    public void setSoundRequired(boolean soundRequired) {
        this.soundRequired = soundRequired;
    }

    public boolean isSecurityRequired() {
        return securityRequired;
    }

    public void setSecurityRequired(boolean securityRequired) {
        this.securityRequired = securityRequired;
    }

    public String getResourceNotes() {
        return resourceNotes;
    }

    public void setResourceNotes(String resourceNotes) {
        this.resourceNotes = resourceNotes;
    }

    @Override
    public String toString() {
        return "event{" +
                "eventName='" + eventName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventDate=" + eventDate +
                ", lightingRequired=" + lightingRequired +
                ", soundRequired=" + soundRequired +
                ", securityRequired=" + securityRequired +
                ", resourceNotes='" + resourceNotes + '\'' +
                '}';
    }


}
