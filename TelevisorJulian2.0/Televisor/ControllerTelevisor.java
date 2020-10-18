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
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Julian Riveros-juliancamilorifo@ufps.edu.co)
 * 
 */
public class ControllerTelevisor {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblControl;

    @FXML
    private ImageView imgImage;

    @FXML
    private Button cmdSubirVolumen;

    @FXML
    private Button cmdBajarVolumen;

    @FXML
    private Button cmdAvanzarCanal;

    @FXML
    private Button cmdRetrocederCanal;

    @FXML
    private Button cmdAntena;

    @FXML
    private Button cmdAuxiliar;

    @FXML
    private Button cmdEncendedor;

    @FXML
    private Button cmdCable;

    @FXML
    private Label lblVolumen;

    @FXML
    private Label lblCanal;

    @FXML
    private Label lblEntrada;

    @FXML
    private TextField txtVolumen;

    @FXML
    private TextField txtCanal;

    @FXML
    private TextField txtEntrada;

    private Televisor tv;
    private static boolean estaApagado=false;

    public void inicializar(){
        tv = new Televisor(0,0,0);
        tv.setVolumen(0);
        tv.setCanal(0);
        tv.setTipoDeEntrada(0);
    }

    public void actualizarGUI(){
        txtVolumen.setText(String.valueOf(tv.getVolumen()));
        txtCanal.setText(String.valueOf(tv.getCanal()));
        txtEntrada.setText(String.valueOf(tv.getTipoDeEntrada())); 
    }

    @FXML
    void Apagar(ActionEvent event) {
        if(estaApagado==false){
            cmdAntena.setDisable(false);
            cmdCable.setDisable(false);
            cmdAuxiliar.setDisable(false);
            cmdSubirVolumen.setDisable(false);
            cmdBajarVolumen.setDisable(false);
            cmdAvanzarCanal.setDisable(false);
            cmdRetrocederCanal.setDisable(false);
            tv.setTipoDeEntrada(1);
            tv.setCanal(1);
            actualizarGUI();
            estaApagado=true;
        }else if(estaApagado==true){
            cmdAntena.setDisable(true);
            cmdCable.setDisable(true);
            cmdAuxiliar.setDisable(true);
            cmdSubirVolumen.setDisable(true);
            cmdBajarVolumen.setDisable(true);
            cmdAvanzarCanal.setDisable(true);
            cmdRetrocederCanal.setDisable(true);
            tv.setTipoDeEntrada(0);
            tv.setCanal(0);
            actualizarGUI();
            estaApagado=false;
        }
    }

    @FXML
    void antena(ActionEvent event) {
        tv.setTipoDeEntrada(1);
        tv.setVolumen(0);
        tv.setCanal(1);
        actualizarGUI();
    }

    @FXML
    void auxiliar(ActionEvent event) {
        tv.setTipoDeEntrada(3);
        tv.setVolumen(0);
        tv.setCanal(1);
        actualizarGUI();
    }

    @FXML
    void avanzarCanal(ActionEvent event) {
        tv.avanzarCanal();
        actualizarGUI();
    }

    @FXML
    void bajarVolumen(ActionEvent event) {
        tv.bajarVolumen();
        actualizarGUI();
    }

    @FXML
    void cable(ActionEvent event) {
        tv.setTipoDeEntrada(2);
        tv.setVolumen(0);
        tv.setCanal(1);
        actualizarGUI();
    }

    @FXML
    void retrocederCanal(ActionEvent event) {
        tv.retrocederCanal();
        actualizarGUI();
    }

    @FXML
    void subirVolumen(ActionEvent event) {
        if(tv.subirVolumen()){
            actualizarGUI();
        }else{
        mostrarAlertError(event, "No se puede subir más volumen, despertará a los vecinos");
    }
    }

    @FXML
    private void mostrarAlertError(ActionEvent event, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        assert lblControl != null : "fx:id=\"lblControl\" was not injected: check your FXML file 'tv.fxml'.";
        assert imgImage != null : "fx:id=\"imgImage\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdSubirVolumen != null : "fx:id=\"cmdSubirVolumen\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdBajarVolumen != null : "fx:id=\"cmdBajarVolumen\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdAvanzarCanal != null : "fx:id=\"cmdAvanzarCanal\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdRetrocederCanal != null : "fx:id=\"cmdRetrocederCanal\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdAntena != null : "fx:id=\"cmdAntena\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdAuxiliar != null : "fx:id=\"cmdAuxiliar\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdEncendedor != null : "fx:id=\"cmdEncendedor\" was not injected: check your FXML file 'tv.fxml'.";
        assert cmdCable != null : "fx:id=\"cmdCable\" was not injected: check your FXML file 'tv.fxml'.";
        assert lblVolumen != null : "fx:id=\"lblVolumen\" was not injected: check your FXML file 'tv.fxml'.";
        assert lblCanal != null : "fx:id=\"lblCanal\" was not injected: check your FXML file 'tv.fxml'.";
        assert lblEntrada != null : "fx:id=\"lblEntrada\" was not injected: check your FXML file 'tv.fxml'.";
        assert txtVolumen != null : "fx:id=\"txtVolumen\" was not injected: check your FXML file 'tv.fxml'.";
        assert txtCanal != null : "fx:id=\"txtCanal\" was not injected: check your FXML file 'tv.fxml'.";
        assert txtEntrada != null : "fx:id=\"txtEntrada\" was not injected: check your FXML file 'tv.fxml'.";
        inicializar();
        actualizarGUI();
    }
}
