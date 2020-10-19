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

public class ControllerTriangulo 
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
    private Label lblLado1;

    @FXML
    private TextField txtLado1;

    @FXML
    private Label lblLado2;

    @FXML
    private TextField txtLado2;

    @FXML
    private Label lblLado3;

    @FXML
    private TextField txtLado3;
    
    private Triangulo tri;
    
    public void inicializar()
    {
        tri = new Triangulo();
    }
    
    private void actualizarGUI()
    {
        
        
        
    }

    @FXML
    void actualizar(ActionEvent event) 
    {
        tri.setLado1(Float.parseFloat(txtLado1.getText()));
        tri.setLado2(Float.parseFloat(txtLado2.getText()));
        tri.setLado3(Float.parseFloat(txtLado3.getText()));
    }

    @FXML
    void determinarTipo(ActionEvent event) 
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText(tri.getTipo());
        alert.showAndWait();
    }

    @FXML
    void ponerL1(ActionEvent event) 
    {
        txtLado1.setText(""+tri.getLado1());
    }

    @FXML
    void ponerL2(ActionEvent event) 
    {
        txtLado2.setText(""+tri.getLado2());
    }

    @FXML
    void ponerL3(ActionEvent event) 
    {
        txtLado3.setText(""+tri.getLado3());
    }

    @FXML
    void initialize() 
    {
        assert cmdActualizar != null : "fx:id=\"cmdActualizar\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert cmdDeterminar != null : "fx:id=\"cmdDeterminar\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert lblLado1 != null : "fx:id=\"lblLado1\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert txtLado1 != null : "fx:id=\"txtLado1\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert lblLado2 != null : "fx:id=\"lblLado2\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert txtLado2 != null : "fx:id=\"txtLado2\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert lblLado3 != null : "fx:id=\"lblLado3\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        assert txtLado3 != null : "fx:id=\"txtLado3\" was not injected: check your FXML file 'tarea4triangulo.fxml'.";
        inicializar();
    }
}
