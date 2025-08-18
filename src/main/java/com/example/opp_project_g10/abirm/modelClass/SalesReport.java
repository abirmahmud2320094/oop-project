package com.example.opp_project_g10.abirm.modelClass;

import javafx.event.Event;

import java.time.LocalDate;

public class SalesReport {
    private Event event;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalSales;
    private String categoryFilter;

    public SalesReport() {
    }

    public SalesReport(Event event, LocalDate startDate, LocalDate endDate, double totalSales, String categoryFilter) {
        this.event = event;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalSales = totalSales;
        this.categoryFilter = categoryFilter;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getCategoryFilter() {
        return categoryFilter;
    }

    public void setCategoryFilter(String categoryFilter) {
        this.categoryFilter = categoryFilter;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "event=" + event +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalSales=" + totalSales +
                ", categoryFilter='" + categoryFilter + '\'' +
                '}';
    }
}
