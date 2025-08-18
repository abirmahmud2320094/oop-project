package com.example.opp_project_g10.abirm.modelClass;

import java.time.LocalDateTime;

public class Refund {
    private String refundId;
    private Ticket ticket;
    private double amount;
    private String reason;
    private String method; // Bank Transfer, Cash, Mobile Payment
    private LocalDateTime refundDate;

    public Refund() {
    }

    public Refund(String refundId, Ticket ticket, double amount, String reason, String method, LocalDateTime refundDate) {
        this.refundId = refundId;
        this.ticket = ticket;
        this.amount = amount;
        this.reason = reason;
        this.method = method;
        this.refundDate = refundDate;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDateTime getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(LocalDateTime refundDate) {
        this.refundDate = refundDate;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", ticket=" + ticket +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                ", method='" + method + '\'' +
                ", refundDate=" + refundDate +
                '}';
    }
}
