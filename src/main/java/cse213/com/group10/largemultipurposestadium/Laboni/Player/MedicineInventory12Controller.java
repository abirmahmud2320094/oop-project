package cse213.com.group10.largemultipurposestadium.Laboni.Player;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.time.LocalDate;

public class MedicineInventory12Controller<Medicine> {
    @javafx.fxml.FXML
    private TableColumn<MedicineInventory12, LocalDate> expiryColumn;
    @javafx.fxml.FXML
    private TableColumn<MedicineInventory12, String> nameColumn;
    @javafx.fxml.FXML
    private DatePicker expiryDatePicker;
    @javafx.fxml.FXML
    private TextField medicineNameField;
    @javafx.fxml.FXML
    private TextField stockField;
    @javafx.fxml.FXML
    private TableColumn<MedicineInventory12, Integer> stockColumn;
    @javafx.fxml.FXML
    private TableView<MedicineInventory12> medicineTable;

    private final ObservableList<MedicineInventory12> medicineList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        stockColumn.setCellValueFactory(cellData -> cellData.getValue().stockProperty().asObject());
        expiryColumn.setCellValueFactory(cellData -> cellData.getValue().expiryProperty());

        medicineTable.setItems(medicineList);
    }

    @javafx.fxml.FXML
    public void handleClear(ActionEvent actionEvent) {
        medicineNameField.clear();
        stockField.clear();
        expiryDatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void handleUpdate(ActionEvent actionEvent) {
        String name = medicineNameField.getText();
        String stockStr = stockField.getText();
        LocalDate expiry = expiryDatePicker.getValue();

        if(name.isEmpty() || stockStr.isEmpty() || expiry == null) {
            System.out.println("Please fill all fields!");
            return;
        }

        int stock;
        try { stock = Integer.parseInt(stockStr); }
        catch(NumberFormatException e) {
            System.out.println("Invalid stock value!");
            return;
        }

            boolean found = false;
            for (MedicineInventory12 m : medicineList) {
                if (m.getName().equalsIgnoreCase(name)) {
                    m.setStock(stock);
                    m.setExpiry(expiry);
                    found = true;
                    break;
                }
            }

            if (!found) {
                medicineList.add(new MedicineInventory12(name, stock, expiry));
            }


            ActionEvent event = new ActionEvent();
            handleClear(event);


    }
}