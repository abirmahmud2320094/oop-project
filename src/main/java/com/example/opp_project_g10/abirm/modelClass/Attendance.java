package com.example.opp_project_g10.abirm.modelClass;

import javafx.event.Event;

import java.time.LocalDateTime;

public class Attendance {
    private Ticket ticket;
    private Event event;
    private LocalDateTime entryTime;
    private boolean valid;

    public Attendance() {
    }

    public Attendance(Ticket ticket, Event event, LocalDateTime entryTime, boolean valid) {
        this.ticket = ticket;
        this.event = event;
        this.entryTime = entryTime;
        this.valid = valid;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "ticket=" + ticket +
                ", event=" + event +
                ", entryTime=" + entryTime +
                ", valid=" + valid +
                '}';
    }
}
