import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class ControllerCirculo 
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdActualizar;

    @FXML
    private Button cmdDeterminar;

    @FXML
    private Text lblTitulo;

    @FXML
    private Label lblCentroX;

    @FXML
    private TextField txtCentroX;

    @FXML
    private Label lblCentroY;

    @FXML
    private TextField txtCentroY;

    @FXML
    private Label lblRadio;

    @FXML
    private TextField txtRadio;

    @FXML
    private Label lblCoordenadasX;

    @FXML
    private TextField txtCoordenadasX;

    @FXML
    private Label lblCoordenadasY;

    @FXML
    private TextField txtCoordenadasY;
    
    private Circulo cir;
    
    private void inicializar()
    {
        cir = new Circulo();
    }
    

    @FXML
    void actualizar(ActionEvent event) 
    {
        cir.setCentroX(Float.parseFloat(txtCentroX.getText()));
        cir.setCentroY(Float.parseFloat(txtCentroY.getText()));
        cir.setX(Float.parseFloat(txtCoordenadasX.getText()));
        cir.setY(Float.parseFloat(txtCoordenadasY.getText()));
        cir.setRadio(Float.parseFloat(txtRadio.getText()));
    }

    @FXML
    void determinarUbicacion(ActionEvent event) 
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("UBICACION DEL PUNTO");
        alert.setHeaderText(null);
        alert.setContentText(cir.getPosicionPunto(cir.x,cir.y));
        alert.showAndWait();
    }

    @FXML
    void ponerCentroX(ActionEvent event) 
    {
        txtCentroX.setText(""+cir.getCentroX());
    }

    @FXML
    void ponerCentroY(ActionEvent event) 
    {
        txtCentroY.setText(""+cir.getCentroY());
    }

    @FXML
    void ponerCoordenadasX(ActionEvent event) 
    {
        cir.setX(Float.parseFloat(txtCoordenadasX.getText()));
    }

    @FXML
    void ponerCoordenadasY(ActionEvent event) 
    {
        cir.setY(Float.parseFloat(txtCoordenadasY.getText()));
    }

    @FXML
    void ponerRadio(ActionEvent event) 
    {
        txtRadio.setText(""+cir.getRadio());
    }

    @FXML
    void initialize() 
    {
        assert cmdActualizar != null : "fx:id=\"cmdActualizar\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert cmdDeterminar != null : "fx:id=\"cmdDeterminar\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblCentroX != null : "fx:id=\"lblCentroX\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert txtCentroX != null : "fx:id=\"txtCentroX\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblCentroY != null : "fx:id=\"lblCentroY\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert txtCentroY != null : "fx:id=\"txtCentroY\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblRadio != null : "fx:id=\"lblRadio\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert txtRadio != null : "fx:id=\"txtRadio\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblCoordenadasX != null : "fx:id=\"lblCoordenadasX\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert txtCoordenadasX != null : "fx:id=\"txtCoordenadasX\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert lblCoordenadasY != null : "fx:id=\"lblCoordenadasY\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        assert txtCoordenadasY != null : "fx:id=\"txtCoordenadasY\" was not injected: check your FXML file 'tarea6circulo.fxml'.";
        inicializar();
    }
}

