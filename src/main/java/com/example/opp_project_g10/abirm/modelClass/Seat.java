package com.example.opp_project_g10.abirm.modelClass;

public class Seat {
    private String seatNumber;
    private boolean reserved;
    private boolean blocked;

    public Seat() {
    }

    public Seat(String seatNumber, boolean reserved, boolean blocked) {
        this.seatNumber = seatNumber;
        this.reserved = reserved;
        this.blocked = blocked;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", reserved=" + reserved +
                ", blocked=" + blocked +
                '}';
    }
}
