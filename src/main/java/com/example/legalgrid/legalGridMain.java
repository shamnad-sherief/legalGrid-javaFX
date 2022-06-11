package com.example.legalgrid;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import static com.example.legalgrid.legalGridController.*;



public class legalGridMain extends Application{



    @Override
    public void start(Stage stage) throws IOException {

        initializeDB();


        FXMLLoader fxmlLoader = new FXMLLoader(legalGridController.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 787, 584);
        stage.setTitle("Legal Grid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}