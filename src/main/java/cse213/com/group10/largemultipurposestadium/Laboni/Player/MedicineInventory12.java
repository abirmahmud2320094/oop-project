package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.beans.property.*;
import java.time.LocalDate;

public class MedicineInventory12 {
    private final StringProperty name;
    private final IntegerProperty stock;
    private final ObjectProperty<LocalDate> expiry;

    public MedicineInventory12(String name, int stock, LocalDate expiry) {
        this.name = new SimpleStringProperty(name);
        this.stock = new SimpleIntegerProperty(stock);
        this.expiry = new SimpleObjectProperty<>(expiry);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public IntegerProperty stockProperty() {
        return stock;
    }

    public ObjectProperty<LocalDate> expiryProperty() {
        return expiry;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getStock() {
        return stock.get();
    }

    public void setStock(int stock) {
        this.stock.set(stock);
    }

    public LocalDate getExpiry() {
        return expiry.get();
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry.set(expiry);
    }

}
