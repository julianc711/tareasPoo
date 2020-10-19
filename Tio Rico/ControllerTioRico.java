import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControllerTioRico {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblPrecioCompra;

    @FXML
    private Label lblPrecioVenta;

    @FXML
    private Label lblComprarBolivares;

    @FXML
    private Label lblVenderBolivares;

    @FXML
    private Label lblBolivaresEnCaja;

    @FXML
    private Label lblPesosEnCaja;

    @FXML
    private TextField txtPrecioCompra;

    @FXML
    private TextField txtPrecioVenta;

    @FXML
    private TextField txtComprarBolivares;

    @FXML
    private TextField txtVenderBolivares;

    @FXML
    private TextField txtBolivaresEnCaja;

    @FXML
    private TextField txtPesosEnCaja;

    @FXML
    private Button cmdActualizarPrecioDeCompra;

    @FXML
    private Button cmdVenderBolivares;

    @FXML
    private Button cmdComprarBolivares;

    @FXML
    private Button cmdInyectarBolivares;

    @FXML
    private Button cmdInyectarPesos;

    @FXML
    private Button cmdCambiarPrecioDeVenta;

    @FXML
    private Label lblInyectarBolivares;

    @FXML
    private Label lblInyectarPesos;

    @FXML
    private TextField txtInyectarBolivares;

    @FXML
    private TextField txtInyectarPesos;

    @FXML
    private TextField txtBolivaresComprados;

    @FXML
    private TextField txtBolivaresVendidos;

    @FXML
    private Label lblBolivaresComprados;

    @FXML
    private Label lblBolivaresVendidos;

    @FXML
    private Label lblImpuestos;

    @FXML
    private Label lblGanancias;

    @FXML
    private TextField txtGanancias;

    @FXML
    private TextField txtImpuestos;

    @FXML
    private Label lblGananciaEnUnBolivar;

    @FXML
    private TextField txtGananciaEnUnBolivar;

    @FXML
    private ImageView imgPicture;
    
    private ModelCasaDeCambio t;

    @FXML
    private void mostrarAlertInfo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("INFORMACIÓN");
        alert.setContentText("Datos Actualizados");
        alert.showAndWait();
    }

    @FXML
    void ejecutarActualizarPrecioDeCompra(ActionEvent event) {
        t.setPrecioDeCompra(Float.parseFloat(txtPrecioCompra.getText()));
        txtPrecioCompra.setText(""+t.getPrecioDeCompra());
        mostrarAlertInfo(event);
        
        txtGananciaEnUnBolivar.setText(""+t.getGananciaEnUnBolivar());
    }

    @FXML
    void ejecutarActualizarPrecioDeVenta(ActionEvent event) {
        t.setPrecioDeVenta(Float.parseFloat(txtPrecioVenta.getText()));
        txtPrecioVenta.setText(""+t.getPrecioDeVenta());
        mostrarAlertInfo(event);
        
        txtGananciaEnUnBolivar.setText(""+t.getGananciaEnUnBolivar());

    }

    @FXML
    void ejecutarComprarBolivares(ActionEvent event) {
        t.setBolivaresComprados(Integer.parseInt(txtComprarBolivares.getText()));
        txtBolivaresComprados.setText(""+t.getBolivaresComprados());
        t.setBolivaresEnCaja(Integer.parseInt(txtComprarBolivares.getText()));
        txtBolivaresEnCaja.setText(""+t.getBolivaresEnCaja());
        mostrarAlertInfo(event);
        

    }
    
    @FXML
    void ejecutarVenderBolivares(ActionEvent event) {
        t.setBolivaresVendidos(Integer.parseInt(txtVenderBolivares.getText()));
        txtBolivaresComprados.setText(""+t.getBolivaresVendidos());
        t.setPesosEnCaja(Integer.parseInt(txtComprarBolivares.getText()));
        txtPesosEnCaja.setText(""+t.getPesosEnCaja());
        actualizarGUI();
        mostrarAlertInfo(event);
        

    }

    @FXML
    void ejecutarInyectarBolivares(ActionEvent event) {
        t.inyectarBolivares(Integer.parseInt(txtInyectarBolivares.getText()));
        txtBolivaresEnCaja.setText(""+t.getBolivaresEnCaja());
        mostrarAlertInfo(event);

    }

    @FXML
    void ejecutarInyectarPesos(ActionEvent event) {
        t.inyectarPesos(Integer.parseInt(txtInyectarPesos.getText()));
        txtPesosEnCaja.setText(""+t.getPesosEnCaja());
        mostrarAlertInfo(event);

    }
    
    private void actualizarGUI(){
        txtComprarBolivares.setText(""+t.getBolivaresComprados());
        txtVenderBolivares.setText(""+t.getBolivaresVendidos());
        txtInyectarBolivares.setText("");
        txtInyectarPesos.setText("");
        txtBolivaresEnCaja.setText(""+t.getBolivaresEnCaja());
        txtPesosEnCaja.setText(""+t.getPesosEnCaja());
        txtImpuestos.setText(""+t.getImpuestos());
        txtGanancias.setText(""+t.getGanancias());
        
    }
    
    @FXML
    void initialize() {
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblPrecioCompra != null : "fx:id=\"lblPrecioCompra\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblPrecioVenta != null : "fx:id=\"lblPrecioVenta\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblComprarBolivares != null : "fx:id=\"lblComprarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblVenderBolivares != null : "fx:id=\"lblVenderBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblBolivaresEnCaja != null : "fx:id=\"lblBolivaresEnCaja\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblPesosEnCaja != null : "fx:id=\"lblPesosEnCaja\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtPrecioCompra != null : "fx:id=\"txtPrecioCompra\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtPrecioVenta != null : "fx:id=\"txtPrecioVenta\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtComprarBolivares != null : "fx:id=\"txtComprarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtVenderBolivares != null : "fx:id=\"txtVenderBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtBolivaresEnCaja != null : "fx:id=\"txtBolivaresEnCaja\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtPesosEnCaja != null : "fx:id=\"txtPesosEnCaja\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdActualizarPrecioDeCompra != null : "fx:id=\"cmdActualizarPrecioDeCompra\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdVenderBolivares != null : "fx:id=\"cmdVenderBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdComprarBolivares != null : "fx:id=\"cmdComprarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdInyectarBolivares != null : "fx:id=\"cmdInyectarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdInyectarPesos != null : "fx:id=\"cmdInyectarPesos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert cmdCambiarPrecioDeVenta != null : "fx:id=\"cmdCambiarPrecioDeVenta\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblInyectarBolivares != null : "fx:id=\"lblInyectarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblInyectarPesos != null : "fx:id=\"lblInyectarPesos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtInyectarBolivares != null : "fx:id=\"txtInyectarBolivares\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtInyectarPesos != null : "fx:id=\"txtInyectarPesos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtBolivaresComprados != null : "fx:id=\"txtBolivaresComprados\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtBolivaresVendidos != null : "fx:id=\"txtBolivaresVendidos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblBolivaresComprados != null : "fx:id=\"lblBolivaresComprados\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblBolivaresVendidos != null : "fx:id=\"lblBolivaresVendidos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblImpuestos != null : "fx:id=\"lblImpuestos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblGanancias != null : "fx:id=\"lblGanancias\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtGanancias != null : "fx:id=\"txtGanancias\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtImpuestos != null : "fx:id=\"txtImpuestos\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert lblGananciaEnUnBolivar != null : "fx:id=\"lblGananciaEnUnBolivar\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert txtGananciaEnUnBolivar != null : "fx:id=\"txtGananciaEnUnBolivar\" was not injected: check your FXML file 'TioRico.fxml'.";
        assert imgPicture != null : "fx:id=\"imgPicture\" was not injected: check your FXML file 'TioRico.fxml'.";
        
        t = new ModelCasaDeCambio();
        
        actualizarGUI();

    }
}
