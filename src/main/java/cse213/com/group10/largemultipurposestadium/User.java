package cse213.com.group10.largemultipurposestadium;

import java.time.LocalDate;

public class User {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private UserType userType;
    private boolean isActive;
    private LocalDate registrationDate;

    public String getName() {
        return "";
    }

    public enum UserType {
        PLAYER,
        MEDICAL_STAFF,
        ADMIN,
        COACH,
        STAFF
    }


    public User() {
        this.registrationDate = LocalDate.now();
        this.isActive = true;
    }


    public User(int id, String username, String password, String fullName,
                UserType userType) {
        this();
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.userType = userType;
    }

    public User(int id, String username, String password, String fullName,
                String email, String phone, LocalDate dateOfBirth,
                UserType userType) {
        this(id, username, password, fullName, userType);
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    // Business logic methods
    public int calculateAge() {
        if (dateOfBirth == null) return 0;
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String getFormattedInfo() {
        return String.format("%s (%s) - %s", fullName, username, userType);
    }

    public boolean isPlayer() {
        return userType == UserType.PLAYER;
    }

    public boolean isMedicalStaff() {
        return userType == UserType.MEDICAL_STAFF;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userType=" + userType +
                ", registrationDate=" + registrationDate +
                '}';
    }


}
