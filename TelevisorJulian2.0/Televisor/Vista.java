import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Julian Riveros-juliancamilorifo@ufps.edu.co)
 * 
 */

public class Vista extends Application{
    

    public void start(Stage stage) throws IOException{
        // Create the FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "tv.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        // Create the Pane and all Details
        Pane root = (Pane) loader.load(fxmlStream);

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Control del televisor");
        stage.resizableProperty().setValue(Boolean.FALSE);
        // Display the Stage
        stage.show();
    }

}
