package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public class RequestEquipment {
    private String equipmentType;
    private int quantity;
    private String reason;
    private String status;
    private String pickupLocation;

    public RequestEquipment(String equipmentType, int quantity, String reason, String status, String pickupLocation) {
        this.equipmentType = equipmentType;
        this.quantity = quantity;
        this.reason = reason;
        this.status = status;
        this.pickupLocation = pickupLocation;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    @Override
    public String toString() {
        return "Equipment: " + equipmentType +
                ", Qty: " + quantity +
                ", Reason: " + reason +
                ", Status: " + status +
                ", Pickup: " + pickupLocation;
    }
}