import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Julian Riveros-juliancamilorifo@ufps.edu.co)
 * 
 */
public class ControllerReloj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblHorario;

    @FXML
    private Button cmdAdelantarHorario;

    @FXML
    private Button cmdRetrocederHorario;

    @FXML
    private Label lblMinutero;

    @FXML
    private Button cmdRetrocederMinutero;

    @FXML
    private Button cmdAdelantarMinutero;

    @FXML
    private Label lblSecundero;

    @FXML
    private Button cmdRetrocederSecundero;

    @FXML
    private Button cmdAdelantarSecundero;

    @FXML
    private TextArea txtHoras;

    @FXML
    private TextArea txtMinutos;

    @FXML
    private TextArea txtSegundos;

    @FXML
    private Label lblReloj;

    private Reloj reloj;
    
    public void inicializar(){
        reloj = new Reloj(12,0,0);
        reloj.setHoras(12);
        reloj.setMinutos(0);
        reloj.setSegundos(0);
    }
    
    public void actualizarGUI(){
        txtHoras.setText(""+reloj.getHoras());
        txtMinutos.setText(""+reloj.getMinutos());
        txtSegundos.setText(""+reloj.getSegundos());
    }
    
    @FXML
    void adelantarHorario(ActionEvent event) {
        reloj.avanzarHorario();
        actualizarGUI();
    }

    @FXML
    void adelantarMinutero(ActionEvent event) {
        reloj.avanzarMinutero();
        actualizarGUI();
    }

    @FXML
    void adelantarSecundero(ActionEvent event) {
        reloj.avanzarSegundero();
        actualizarGUI();
    }

    @FXML
    void retrocederHorario(ActionEvent event) {
        reloj.retrocederHorario();
        actualizarGUI();
    }

    @FXML
    void retrocederMinutero(ActionEvent event) {
        reloj.retrocederMinutero();
        actualizarGUI();
    }

    @FXML
    void retrocederSecundero(ActionEvent event) {
        reloj.retrocederSegundero();
        actualizarGUI();
    }

    @FXML
    void initialize() {
        assert lblHorario != null : "fx:id=\"lblHorario\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdAdelantarHorario != null : "fx:id=\"cmdAdelantarHorario\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdRetrocederHorario != null : "fx:id=\"cmdRetrocederHorario\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert lblMinutero != null : "fx:id=\"lblMinutero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdRetrocederMinutero != null : "fx:id=\"cmdRetrocederMinutero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdAdelantarMinutero != null : "fx:id=\"cmdAdelantarMinutero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert lblSecundero != null : "fx:id=\"lblSecundero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdRetrocederSecundero != null : "fx:id=\"cmdRetrocederSecundero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert cmdAdelantarSecundero != null : "fx:id=\"cmdAdelantarSecundero\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert txtHoras != null : "fx:id=\"txtHoras\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert txtSegundos != null : "fx:id=\"txtSegundos\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        assert lblReloj != null : "fx:id=\"lblReloj\" was not injected: check your FXML file 'RelojAvanzado.fxml'.";
        inicializar();
        actualizarGUI();
    }
}
