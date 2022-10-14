package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	public static Stage stage;

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		
		try {
			
			
			
			/*FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/Main.fxml"));

			AnchorPane layout = (AnchorPane) loader.load();

			Scene scene = new Scene(layout);

			primaryStage.setScene(scene);

			primaryStage.show();*/
			
			AnchorPane root = new AnchorPane();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation( getClass().getResource("view/Main.fxml") );
            root = (AnchorPane) loader.load();
            Scene scene = new Scene( root );
            primaryStage.setScene( scene );
            primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
