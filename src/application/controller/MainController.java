package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MainController implements EventHandler<ActionEvent> {

	@FXML
	Button BTLogin;
	

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Login.fxml"));

			Scene scene = new Scene(loader.load());

			Main.stage.setScene(scene);
			Main.stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
