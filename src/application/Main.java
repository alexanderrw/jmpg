package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage mainstage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("main.fxml"));
			
			Scene scene = new Scene(root, 650, 450);
			mainstage.setMinWidth(650);
			mainstage.setMinHeight(450);
			
			scene.getStylesheets().add(getClass().getResource("default_theme.css").toExternalForm());
			mainstage.setScene(scene);
			mainstage.show();
			
			Controller.mainstage = mainstage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
