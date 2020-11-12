package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

public class Controller {
	@FXML BorderPane mainwindow;
	
	@FXML BorderPane mediacontrolpane;
	@FXML ProgressBar song_progressbar;
	@FXML Button playbutton;
	@FXML Slider volumeslider;
	@FXML Label filelabel;
	
	@FXML MenuBar menubar;
	@FXML Menu filemenu;
	@FXML MenuItem fileopenbutton;
	@FXML Menu helpmenu;
	@FXML MenuItem helpaboutbutton;
	
	public Controller() {}
	
    @FXML private void initialize() {
    	// Window is created.
    }
    
    
}
