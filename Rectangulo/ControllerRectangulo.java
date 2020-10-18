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

public class ControllerRectangulo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button cmdActualizarCoordenadas;

    @FXML
    private Button cmdDeterminarPosicion;

    @FXML
    private Button cmdAyuda;

    @FXML
    private Label lblOrigenX;

    @FXML
    private Label lblOrigenY;

    @FXML
    private Label lblAncho;

    @FXML
    private Label lblAlto;

    @FXML
    private Label lblCoordenadaX;

    @FXML
    private Label lblCoordenadaY;

    @FXML
    private TextField txtOrigenX;

    @FXML
    private TextField txtOrigenY;

    @FXML
    private TextField txtAncho;

    @FXML
    private TextField txtAlto;

    @FXML
    private TextField txtCoordenadaX;

    @FXML
    private TextField txtCoordenadaY;

    @FXML
    private TextField txtRespuesta;
    
    private Rectangulo rect;
    
    @FXML
    private void mostrarAlertInfo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("INFORMACIÓN");
        alert.setContentText("Coordenadas actualizadas");
        alert.showAndWait();
    }
    
    @FXML
    private void mostrarAlertInfoAyuda(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("INFORMACIÓN");
        alert.setContentText("Determina la ubicación de un punto relativa a un rectangulo");
        alert.showAndWait();
    }

    @FXML
    void ejecutarActualizarCoordenadas(ActionEvent event) {//guardar
        rect.setOrigenX(Float.parseFloat(txtOrigenX.getText()));
        rect.setOrigenY(Float.parseFloat(txtOrigenY.getText()));
        rect.setAncho(Float.parseFloat(txtAncho.getText()));
        rect.setAlto(Float.parseFloat(txtAlto.getText()));
        rect.getPosicionPunto(Float.parseFloat(txtCoordenadaX.getText()), Float.parseFloat(txtCoordenadaY.getText()));
        
        mostrarAlertInfo(event);
    }

    @FXML
    void ejecutarAyuda(ActionEvent event) {
        mostrarAlertInfoAyuda(event);
    }

    @FXML
    void ejecutarDeterminarPosicion(ActionEvent event) {
        rect.getPosicionPunto(Float.parseFloat(txtCoordenadaX.getText()), Float.parseFloat(txtCoordenadaY.getText()));
        txtRespuesta.setText(""+rect.getPosicionPunto(Float.parseFloat(txtCoordenadaX.getText()), Float.parseFloat(txtCoordenadaY.getText())));
        
    }
    
    private void actualizarGUI(){
        txtOrigenX.setText(""+rect.getOrigenX());
        txtOrigenY.setText(""+rect.getOrigenY());
        
        txtAncho.setText(""+rect.getAncho());
        txtAlto.setText(""+rect.getAlto());
        
        txtCoordenadaX.setText(""+rect.ancho);
        txtCoordenadaY.setText(""+rect.alto);
    }

    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert cmdActualizarCoordenadas != null : "fx:id=\"cmdActualizarCoordenadas\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert cmdDeterminarPosicion != null : "fx:id=\"cmdDeterminarPosicion\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert cmdAyuda != null : "fx:id=\"cmdAyuda\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblOrigenX != null : "fx:id=\"lblOrigenX\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblOrigenY != null : "fx:id=\"lblOrigenY\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblAncho != null : "fx:id=\"lblAncho\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblAlto != null : "fx:id=\"lblAlto\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblCoordenadaX != null : "fx:id=\"lblCoordenadaX\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert lblCoordenadaY != null : "fx:id=\"lblCoordenadaY\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtOrigenX != null : "fx:id=\"txtOrigenX\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtOrigenY != null : "fx:id=\"txtOrigenY\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtAncho != null : "fx:id=\"txtAncho\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtAlto != null : "fx:id=\"txtAlto\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtCoordenadaX != null : "fx:id=\"txtCoordenadaX\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtCoordenadaY != null : "fx:id=\"txtCoordenadaY\" was not injected: check your FXML file 'rectangulo.fxml'.";
        assert txtRespuesta != null : "fx:id=\"txtRespuesta\" was not injected: check your FXML file 'rectangulo.fxml'."; 
        
        rect = new Rectangulo();
        
        actualizarGUI();

    }
}
