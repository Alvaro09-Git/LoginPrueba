package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SegundoController { // controlador de mi boton atras
	@FXML
	private JFXTextField txusuario;

	@FXML
	private JFXTextField txnombre;

	@FXML
	private JFXButton Botonfinalizar;

	
	@FXML
	private JFXTextField txpassword;

	@FXML

	private JFXButton Atras;
	 @FXML
	    void pulsarfinalizar(ActionEvent event) {
		 String nombre; // creamos las 3 variables de mi registro
		 String usuario;
		 String contraseña;
		 
		 nombre = txnombre.getText();
		 usuario = txusuario.getText();
		 contraseña = txpassword.getText();
		 
		 Persona nuevaPersona = new Persona(nombre, usuario, contraseña);
		 
		 Stage stage = (Stage) Botonfinalizar.getScene().getWindow();
			stage.close();

			String vista = "LoginView.fxml"; // ventana elegida al pulsarlo 
			String titulo = "Login";// nombre de la ventana
			LoginPruebaController control = new LoginPruebaController(); // para volver al login necesito el controlador de dicha venatana 
			crearVentana(vista, titulo, control);
		 
		 

	    }
	
	@FXML
	void pulsarbotonatras(ActionEvent event) {
		Stage stage = (Stage) Atras.getScene().getWindow();
		stage.close();

		String vista = "LoginView.fxml"; // ventana elegida al pulsarlo 
		String titulo = "Login";// nombre de la ventana
		LoginPruebaController control = new LoginPruebaController(); // para volver al login necesito el controlador de dicha venatana 
		crearVentana(vista, titulo, control);





	}
	public void crearVentana(String vista, String titulo, Object object) { // Aprender de memoria, lo necesito para la creacion de la ventana 
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource(vista));
			loader.setController(object);
			AnchorPane page = (AnchorPane) loader.load();

			Stage sendStage = new Stage();
			sendStage.setTitle(titulo);
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
