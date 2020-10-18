import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerReloj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblReloj;

    @FXML
    private ImageView imgReloj;

    @FXML
    private Button cmdHorario;

    @FXML
    private Button cmdMinutero;

    @FXML
    private Button cmdSecundero;

    @FXML
    private Label lblHoras;

    @FXML
    private Label lblMinutos;

    @FXML
    private Label lblSegundos;

    @FXML
    private TextField txtHoras;

    @FXML
    private TextField txtMinutos;

    @FXML
    private TextField txtSegundos;
    
    private Reloj r;
    public ControllerReloj(){
        r = new Reloj(0,0,0);
    }
    
    public void inicializar(){
        r.setHoras(0);
        r.setMinutos(0);
        r.setSegundos(0);
    }
    
    private void actualizarGUI(){//mostrar
        txtHoras.setText(""+r.getHoras());
        txtMinutos.setText(""+r.getMinutos());
        txtSegundos.setText(""+r.getSegundos());
    }

    @FXML
    void moverHorario(ActionEvent event) {
        r.moverHorario();
        actualizarGUI();
    }

    @FXML
    void moverMinutero(ActionEvent event) {
        r.moverMinutero();
        actualizarGUI();
    }

    @FXML
    void moverSegundero(ActionEvent event) {
        r.moverSegundero();
        actualizarGUI();
    }

    @FXML
    void initialize() {
        assert lblReloj != null : "fx:id=\"lblReloj\" was not injected: check your FXML file 'reloj.fxml'.";
        assert imgReloj != null : "fx:id=\"imgReloj\" was not injected: check your FXML file 'reloj.fxml'.";
        assert cmdHorario != null : "fx:id=\"cmdHorario\" was not injected: check your FXML file 'reloj.fxml'.";
        assert cmdMinutero != null : "fx:id=\"cmdMinutero\" was not injected: check your FXML file 'reloj.fxml'.";
        assert cmdSecundero != null : "fx:id=\"cmdSecundero\" was not injected: check your FXML file 'reloj.fxml'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'reloj.fxml'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'reloj.fxml'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'reloj.fxml'.";
        assert txtHoras != null : "fx:id=\"txtHoras\" was not injected: check your FXML file 'reloj.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'reloj.fxml'.";
        assert txtSegundos != null : "fx:id=\"txtSegundos\" was not injected: check your FXML file 'reloj.fxml'.";
        inicializar();
        actualizarGUI();
    }
}
