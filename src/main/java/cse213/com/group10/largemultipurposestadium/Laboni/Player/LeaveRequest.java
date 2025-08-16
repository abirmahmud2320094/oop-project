package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;
public class LeaveRequest {
    private String leaveType;
    private LocalDate leaveDate;
    private String reason;

    public LeaveRequest(String leaveType, LocalDate leaveDate, String reason) {
        this.leaveType = leaveType;
        this.leaveDate = leaveDate;
        this.reason = reason;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public String getReason() {
        return reason;
    }
}


