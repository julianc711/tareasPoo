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
 * Controlador
 * 
 * @author Julian Riveros 
 */

public class ControllerLibros {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblRegistro;

    @FXML
    private ImageView imgLibros;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblAutores;

    @FXML
    private Label lblEditorial;

    @FXML
    private Label lblAnioEdición;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblNumeroPaginas;

    @FXML
    private Label lblNumeroCopias;

    @FXML
    private Label lblCopiasDisponibles;

    @FXML
    private Label lblNumeroCopiasPrestadas;

    @FXML
    private TextField txtAutores;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtAnioEdicion;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtNumeroPaginas;

    @FXML
    private TextField txtNumeroCopias;

    @FXML
    private TextField txtNumeroCopiasDisponibles;

    @FXML
    private TextField txtNumeroCopiasPrestadas;

    @FXML
    private Button cmdGuardarCambios;

    @FXML
    private Button cmdActualizarPantalla;

    @FXML
    private Button cmdRegistrarPrestramo;

    @FXML
    private Button cmdRegistrarDevolucion;

    private Libro l;

    public ControllerLibros(){
        l = new Libro();
    }

    @FXML
    void actualizar(ActionEvent event) {
        actualizarGUI();
    }

    @FXML
    void devolver(ActionEvent event) {
        if( l.devolver())
            actualizarGUI();
        else 
            mostrarAlertError(event, "No se puede hacer más devoluciones");
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
    private void mostrarAlertInfo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Se Guardó con éxito");
        alert.showAndWait();
    }

    @FXML
    private void mostrarAlertConfirmation(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "", ButtonType.YES, ButtonType.NO);
        alert.setTitle("Warning!");
        alert.setHeaderText("Confirmacion");
        alert.setContentText("¿Deseas realmente confirmar?");
        alert.getDialogPane().setPrefSize(200, 100);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.YES) {
            l.setTitulo(txtTitulo.getText());
            l.setAutores(txtAutores.getText());
            l.setEditorial(txtEditorial.getText());
            l.setAñoEdicion(Integer.parseInt(txtAnioEdicion.getText()));
            l.setPrecio(Integer.parseInt(txtPrecio.getText()));
            l.setNumeroDePaginas(Integer.parseInt(txtNumeroPaginas.getText()));
            l.cambiarNumeroDeCopias(Integer.parseInt(txtNumeroCopias.getText()));
            mostrarAlertInfo(event);
        } else {
            actualizarGUI(); 
        }
    }
    // ... user chose NO or 

    @FXML
    void guardar(ActionEvent event) {
        mostrarAlertConfirmation(event);
    }

    @FXML
    void prestar(ActionEvent event) {
        if( l.prestar())
            actualizarGUI();
        else 
            mostrarAlertError(event, "No suficientes copias Disponibles");
    }

    private void actualizarGUI(){
        txtTitulo.setText(""+l.getTitulo());
        txtAutores.setText(""+l.getAutores());
        txtEditorial.setText(""+l.getEditorial());
        txtAnioEdicion.setText(""+l.getAñoEdicion());
        txtPrecio.setText(""+l.getPrecio());
        txtNumeroPaginas.setText(""+l.getNumeroDePaginas());
        txtNumeroCopias.setText(""+l.getNumeroDeCopias());
        txtNumeroCopiasDisponibles.setText(""+l.getNumeroDeCopiasDisponibles());
        txtNumeroCopiasPrestadas.setText(""+l.getNumeroDeCopiasPrestadas());
    }

    @FXML
    void initialize() {
        assert lblRegistro != null : "fx:id=\"lblRegistro\" was not injected: check your FXML file 'Libro.fxml'.";
        assert imgLibros != null : "fx:id=\"imgLibros\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblAutores != null : "fx:id=\"lblAutores\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblEditorial != null : "fx:id=\"lblEditorial\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblAnioEdición != null : "fx:id=\"lblAnioEdición\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblPrecio != null : "fx:id=\"lblPrecio\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblNumeroPaginas != null : "fx:id=\"lblNumeroPaginas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblNumeroCopias != null : "fx:id=\"lblNumeroCopias\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblCopiasDisponibles != null : "fx:id=\"lblCopiasDisponibles\" was not injected: check your FXML file 'Libro.fxml'.";
        assert lblNumeroCopiasPrestadas != null : "fx:id=\"lblNumeroCopiasPrestadas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtAutores != null : "fx:id=\"txtAutores\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtTitulo != null : "fx:id=\"txtTitulo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtEditorial != null : "fx:id=\"txtEditorial\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtAnioEdicion != null : "fx:id=\"txtAnioEdicion\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtNumeroPaginas != null : "fx:id=\"txtNumeroPaginas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtNumeroCopias != null : "fx:id=\"txtNumeroCopias\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtNumeroCopiasDisponibles != null : "fx:id=\"txtNumeroCopiasDisponibles\" was not injected: check your FXML file 'Libro.fxml'.";
        assert txtNumeroCopiasPrestadas != null : "fx:id=\"txtNumeroCopiasPrestadas\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdGuardarCambios != null : "fx:id=\"cmdGuardarCambios\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdActualizarPantalla != null : "fx:id=\"cmdActualizarPantalla\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdRegistrarPrestramo != null : "fx:id=\"cmdRegistrarPrestramo\" was not injected: check your FXML file 'Libro.fxml'.";
        assert cmdRegistrarDevolucion != null : "fx:id=\"cmdRegistrarDevolucion\" was not injected: check your FXML file 'Libro.fxml'.";
        
    }
}

