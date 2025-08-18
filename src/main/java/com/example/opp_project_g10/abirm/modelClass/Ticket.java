package com.example.opp_project_g10.abirm.modelClass;

public class Ticket {
    private String eventName;
    private String startSeat;
    private String endSeat;
    private double vipPrice;
    private double regPrice;
    private double stuPrice;

    public Ticket() {
    }

    public Ticket(String eventName, String startSeat, String endSeat, double vipPrice, double regPrice, double stuPrice) {
        this.eventName = eventName;
        this.startSeat = startSeat;
        this.endSeat = endSeat;
        this.vipPrice = vipPrice;
        this.regPrice = regPrice;
        this.stuPrice = stuPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartSeat() {
        return startSeat;
    }

    public void setStartSeat(String startSeat) {
        this.startSeat = startSeat;
    }

    public String getEndSeat() {
        return endSeat;
    }

    public void setEndSeat(String endSeat) {
        this.endSeat = endSeat;
    }

    public double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public double getRegPrice() {
        return regPrice;
    }

    public void setRegPrice(double regPrice) {
        this.regPrice = regPrice;
    }

    public double getStuPrice() {
        return stuPrice;
    }

    public void setStuPrice(double stuPrice) {
        this.stuPrice = stuPrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", startSeat='" + startSeat + '\'' +
                ", endSeat='" + endSeat + '\'' +
                ", vipPrice=" + vipPrice +
                ", regPrice=" + regPrice +
                ", stuPrice=" + stuPrice +
                '}';
    }
}
