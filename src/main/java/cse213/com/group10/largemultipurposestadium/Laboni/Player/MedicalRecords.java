package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import java.time.LocalDate;

public class MedicalRecords {


    private final String category;
    private final String title;
    private final String content;
    private final LocalDate date;

    public MedicalRecords(String category, String title, String content, LocalDate date) {
        this.category = category;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public LocalDate getDate() { return date; }
}
