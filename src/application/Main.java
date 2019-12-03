package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
@Override
	
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
			LoginPruebaController control = new LoginPruebaController();
			loader.setController(control);
			Parent root = loader.load(); //crea la vista, es decir, como se va a ver todo

			primaryStage.setTitle("Login"); // titulo de la ventana
			primaryStage.setScene(new Scene(root)); 
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
