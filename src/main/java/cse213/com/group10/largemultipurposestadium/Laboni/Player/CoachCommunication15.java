package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDateTime;

public class CoachCommunication15 {
    private final String coachName;
    private final String message;
    private final LocalDateTime sentTime;

    public CoachCommunication15(String coachName, String message) {
        this.coachName = coachName;
        this.message = message;
        this.sentTime = LocalDateTime.now();
    }

    public String getCoachName() {
        return coachName;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getSentTime() {
        return sentTime;
    }

    public void displayMessage() {
        System.out.println("To Coach: " + coachName);
        System.out.println("Message: " + message);
        System.out.println("Sent at: " + sentTime);
    }
}
