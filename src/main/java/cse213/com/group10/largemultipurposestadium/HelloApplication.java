package cse213.com.group10.largemultipurposestadium;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/cse213/com/group10/largemultipurposestadium/Laboni/Player/PlayerDashboard.fxml"
        ));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Stadium Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

     launch();
   }
}



