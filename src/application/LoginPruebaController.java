package application;
import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

	public class LoginPruebaController { // Cambiamos el nombre a nuesra clase del controlador 
	   
	    @FXML
	    private JFXButton buttonregistrarse; // pegamos esto del Scene Builder, view Sample skeleton

	    @FXML
	    void pulsarbotonregistro(ActionEvent event) { // importamos biblioteca javaFX
	    	Stage stage = (Stage) buttonregistrarse.getScene().getWindow();
			stage.close();
			
			String vista = "RegistroView.fxml";
			String titulo = "Registro";// nombre de la ventana
			SegundoController control = new SegundoController();
			crearVentana(vista, titulo, control);

	    }
	    
	   
	    
	    public void crearVentana(String vista, String titulo, Object object) { // Aprender de memoria
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



