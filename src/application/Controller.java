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
	@FXML static BorderPane mainwindow;
	
	@FXML static BorderPane mediacontrolpane;
	@FXML static ProgressBar song_progressbar;
	@FXML static Button playbutton;
	@FXML static Slider volumeslider;
	@FXML static Label filelabel;
	
	@FXML static MenuBar menubar;
	@FXML static Menu filemenu;
	@FXML static MenuItem fileopenbutton;
	@FXML static Menu helpmenu;
	@FXML static MenuItem helpaboutbutton;
	
	public Controller() {}
	
    @FXML private void initialize() {
    	// Window is created.
    	volumeslider.setValue(volumeslider.getMax() / 2);
    }
    
    @FXML private void open_audio() {
    	FileManager.open_audio();
		if (FileManager.audio_file != null) {
			filelabel.setText(FileManager.audio_file.getName());
		}
		
    	MediaManager.load_audio(FileManager.audio_file);
    };
}
