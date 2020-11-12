package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("main.fxml"));
			
			Scene scene = new Scene(root, 650, 450);
			stage.setMinWidth(650);
			stage.setMinHeight(450);
			
			scene.getStylesheets().add(getClass().getResource("default_theme.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
