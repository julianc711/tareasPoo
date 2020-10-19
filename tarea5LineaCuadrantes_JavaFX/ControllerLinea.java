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

public class ControllerLinea 
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
    private Label lblX1;

    @FXML
    private TextField txtX1;

    @FXML
    private Label lblY1;

    @FXML
    private TextField txtY1;

    @FXML
    private Label lblX2;

    @FXML
    private TextField txtX2;

    @FXML
    private Label lblY2;

    @FXML
    private TextField txtY2;
    
    private Linea lin;
    
    private void inicializar()
    {
        lin = new Linea();
    }

    @FXML
    void actualizar(ActionEvent event) 
    {
        lin.setX1(Float.parseFloat(txtX1.getText()));
        lin.setY1(Float.parseFloat(txtY1.getText()));
        lin.setX2(Float.parseFloat(txtX2.getText()));
        lin.setY2(Float.parseFloat(txtY2.getText()));
    }

    @FXML
    void determinarUbicacion(ActionEvent event) 
    {
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("UBICACION DE LA LINEA");
        alert.setHeaderText(null);
        alert.setContentText(lin.getUbicacion());
        
        alert.showAndWait();
    }

    @FXML
    void ponerX1(ActionEvent event) 
    {
        //txtX1.setText(""+lin.getX1());
        lin.setX1(Float.parseFloat(txtX1.getText()));
    }

    @FXML
    void ponerX2(ActionEvent event) 
    {
        //txtX2.setText(""+lin.getX2());
        lin.setX2(Float.parseFloat(txtX2.getText()));
    }

    @FXML
    void ponerY1(ActionEvent event) 
    {
        //txtY1.setText(""+lin.getY1());
        lin.setY1(Float.parseFloat(txtY1.getText()));
    }

    @FXML
    void ponerY2(ActionEvent event) 
    {
        //txtY2.setText(""+lin.getY2());
        lin.setY2(Float.parseFloat(txtY2.getText()));
    }

    @FXML
    void initialize() 
    {
        assert cmdActualizar != null : "fx:id=\"cmdActualizar\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert cmdDeterminar != null : "fx:id=\"cmdDeterminar\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert lblX1 != null : "fx:id=\"lblX1\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert txtX1 != null : "fx:id=\"txtX1\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert lblY1 != null : "fx:id=\"lblY1\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert txtY1 != null : "fx:id=\"txtY1\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert lblX2 != null : "fx:id=\"lblX2\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert txtX2 != null : "fx:id=\"txtX2\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert lblY2 != null : "fx:id=\"lblY2\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        assert txtY2 != null : "fx:id=\"txtY2\" was not injected: check your FXML file 'tarea5Linea.fxml'.";
        inicializar();
    }
}

