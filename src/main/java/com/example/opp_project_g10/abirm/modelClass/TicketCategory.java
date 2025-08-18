package com.example.opp_project_g10.abirm.modelClass;

public class TicketCategory {

    private String categoryName;
    private double price;
    private int seatStart;
    private int seatEnd;

    public TicketCategory() {
    }

    public TicketCategory(String categoryName, double price, int seatStart, int seatEnd) {
        this.categoryName = categoryName;
        this.price = price;
        this.seatStart = seatStart;
        this.seatEnd = seatEnd;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeatStart() {
        return seatStart;
    }

    public void setSeatStart(int seatStart) {
        this.seatStart = seatStart;
    }

    public int getSeatEnd() {
        return seatEnd;
    }

    public void setSeatEnd(int seatEnd) {
        this.seatEnd = seatEnd;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", seatStart=" + seatStart +
                ", seatEnd=" + seatEnd +
                '}';
    }
}
