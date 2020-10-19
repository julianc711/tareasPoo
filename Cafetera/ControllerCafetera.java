import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerCafetera {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdFijarPrecioBaseCafe;

    @FXML
    private Button cmdRecargarCafe;

    @FXML
    private Button cmdRecargarAzucar;

    @FXML
    private Button cmdRecargarVasos;

    @FXML
    private Button cmdRegistrarFactura;

    @FXML
    private Button cmdPrepararCafe;

    @FXML
    private Label lblPrecio;

    @FXML
    private TextField txtPrecio;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblCantidadDeCafe;

    @FXML
    private Label lblCantidadDeAzucar;

    @FXML
    private Label lblCantidadDeVasos;

    @FXML
    private Label lblPrecioBaseCafe;

    @FXML
    private Label lblTotalDeIngresos;

    @FXML
    private Label lblTotalDeEgresos;

    @FXML
    private Label lblGananciasAntesDeIVA;

    @FXML
    private Label lblIVA;

    @FXML
    private Label lblGananciasNetas;

    @FXML
    private TextField txtCantidadDeCafe;

    @FXML
    private TextField txtCantidadDeAzucar;

    @FXML
    private TextField txtCantidadDeVasos;

    @FXML
    private TextField txtPrecioBaseCafe;

    @FXML
    private TextField txtTotalDeIngresos;

    @FXML
    private TextField txtTotalDeEgresos;

    @FXML
    private TextField txtGananciasAntesDeIVA;

    @FXML
    private TextField txtIVA;

    @FXML
    private TextField txtGananciasNetas;

    @FXML
    private ImageView imgPicture;

    @FXML
    void ejecutarFijarPrecioBaseCafe(ActionEvent event) {

    }

    @FXML
    void ejecutarPrepararCafe(ActionEvent event) {

    }

    @FXML
    void ejecutarRecargarAzucar(ActionEvent event) {

    }

    @FXML
    void ejecutarRecargarCafe(ActionEvent event) {

    }

    @FXML
    void ejecutarRecargarVasos(ActionEvent event) {

    }

    @FXML
    void ejecutarRegistrarFactura(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cmdFijarPrecioBaseCafe != null : "fx:id=\"cmdFijarPrecioBaseCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert cmdRecargarCafe != null : "fx:id=\"cmdRecargarCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert cmdRecargarAzucar != null : "fx:id=\"cmdRecargarAzucar\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert cmdRecargarVasos != null : "fx:id=\"cmdRecargarVasos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert cmdRegistrarFactura != null : "fx:id=\"cmdRegistrarFactura\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert cmdPrepararCafe != null : "fx:id=\"cmdPrepararCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblPrecio != null : "fx:id=\"lblPrecio\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblCantidadDeCafe != null : "fx:id=\"lblCantidadDeCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblCantidadDeAzucar != null : "fx:id=\"lblCantidadDeAzucar\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblCantidadDeVasos != null : "fx:id=\"lblCantidadDeVasos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblPrecioBaseCafe != null : "fx:id=\"lblPrecioBaseCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblTotalDeIngresos != null : "fx:id=\"lblTotalDeIngresos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblTotalDeEgresos != null : "fx:id=\"lblTotalDeEgresos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblGananciasAntesDeIVA != null : "fx:id=\"lblGananciasAntesDeIVA\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblIVA != null : "fx:id=\"lblIVA\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert lblGananciasNetas != null : "fx:id=\"lblGananciasNetas\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtCantidadDeCafe != null : "fx:id=\"txtCantidadDeCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtCantidadDeAzucar != null : "fx:id=\"txtCantidadDeAzucar\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtCantidadDeVasos != null : "fx:id=\"txtCantidadDeVasos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtPrecioBaseCafe != null : "fx:id=\"txtPrecioBaseCafe\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtTotalDeIngresos != null : "fx:id=\"txtTotalDeIngresos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtTotalDeEgresos != null : "fx:id=\"txtTotalDeEgresos\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtGananciasAntesDeIVA != null : "fx:id=\"txtGananciasAntesDeIVA\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtIVA != null : "fx:id=\"txtIVA\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert txtGananciasNetas != null : "fx:id=\"txtGananciasNetas\" was not injected: check your FXML file 'Cafetera.fxml'.";
        assert imgPicture != null : "fx:id=\"imgPicture\" was not injected: check your FXML file 'Cafetera.fxml'.";

    }
}
