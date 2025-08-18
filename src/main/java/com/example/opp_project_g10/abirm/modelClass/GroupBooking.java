package com.example.opp_project_g10.abirm.modelClass;

import javafx.event.Event;

import java.util.List;

public class GroupBooking {
    private String groupName;
    private int groupSize;
    private Event event;
    private double discountPercentage;
    private double totalBeforeDiscount;
    private double totalAfterDiscount;
    private String paymentStatus; // Pending, Paid
    private List<Ticket> tickets;

    public GroupBooking() {
    }

    public GroupBooking(String groupName, int groupSize, Event event, double discountPercentage, double totalBeforeDiscount, double totalAfterDiscount, String paymentStatus, List<Ticket> tickets) {
        this.groupName = groupName;
        this.groupSize = groupSize;
        this.event = event;
        this.discountPercentage = discountPercentage;
        this.totalBeforeDiscount = totalBeforeDiscount;
        this.totalAfterDiscount = totalAfterDiscount;
        this.paymentStatus = paymentStatus;
        this.tickets = tickets;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getTotalBeforeDiscount() {
        return totalBeforeDiscount;
    }

    public void setTotalBeforeDiscount(double totalBeforeDiscount) {
        this.totalBeforeDiscount = totalBeforeDiscount;
    }

    public double getTotalAfterDiscount() {
        return totalAfterDiscount;
    }

    public void setTotalAfterDiscount(double totalAfterDiscount) {
        this.totalAfterDiscount = totalAfterDiscount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "GroupBooking{" +
                "groupName='" + groupName + '\'' +
                ", groupSize=" + groupSize +
                ", event=" + event +
                ", discountPercentage=" + discountPercentage +
                ", totalBeforeDiscount=" + totalBeforeDiscount +
                ", totalAfterDiscount=" + totalAfterDiscount +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
