package com.example.opp_project_g10.abirm.modelClass;

import java.time.LocalDateTime;

public class Cancellation {
    private String ticketId;
    private String buyerName;
    private String reason;
    private LocalDateTime cancellationDate;

    public Cancellation() {
    }

    public Cancellation(String ticketId, String buyerName, String reason, LocalDateTime cancellationDate) {
        this.ticketId = ticketId;
        this.buyerName = buyerName;
        this.reason = reason;
        this.cancellationDate = cancellationDate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(LocalDateTime cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    @Override
    public String toString() {
        return "Cancellation{" +
                "ticketId='" + ticketId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", reason='" + reason + '\'' +
                ", cancellationDate=" + cancellationDate +
                '}';
    }
}
