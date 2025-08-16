package cse213.com.group10.largemultipurposestadium.Laboni.Player;

public final class coach {
    private String coachId;
    private String name;
    private String email;
    private String phone;

    public coach(String coachId, String name) {
        this.coachId = coachId;
        this.name = name;
    }

    public coach(String coachId, String name, String email, String phone) {
        this.coachId = coachId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getCoachId() { return coachId; }
    public void setCoachId(String coachId) { this.coachId = coachId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return name;
    }
}
