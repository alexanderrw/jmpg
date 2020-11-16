package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller {
	static Stage mainstage;
	
	@FXML private BorderPane mainwindow;
	
	@FXML private BorderPane mediacontrolpane;
	@FXML private ProgressBar song_progressbar;
	@FXML private Button playbutton;
	@FXML private Slider volumeslider;
	@FXML private Label filelabel;
	
	@FXML private MenuBar menubar;
	@FXML private Menu filemenu;
	@FXML private MenuItem fileopenbutton;
	@FXML private Menu helpmenu;
	@FXML private MenuItem helpaboutbutton;
	
	static Alert error_alert = new Alert(AlertType.ERROR);
	
    @FXML private void initialize() {
    	// Window is created.
    	volumeslider.setValue(volumeslider.getMax() / 2);
    	volumeslider.valueProperty().addListener(
    			(observable_value, old_value, new_value) -> {
    		MediaManager.set_volume(new_value.doubleValue());
    	});
    }
    
    @FXML private void open_audio() {
    	if (MediaManager.media_player != null) {
    		MediaManager.media_player.pause();
    		playbutton.setText(">");
    	}
    	FileManager.open_audio();
    	
		if (FileManager.audio_file != null && FileManager.temp_audio_file != null) {
	    	filelabel.setText("Loading audio...");
			MediaManager.load_audio(FileManager.audio_file);
			filelabel.setText(FileManager.audio_file.getName());
		}
    }
    
    @FXML private void toggle_play_pause() {
    	MediaManager.Action action = MediaManager.play_pause_toggle();
    	switch (action) {
    	case PLAY:
    		playbutton.setText("| |");
    		break;
    	case PAUSE:
    		playbutton.setText(">");
    	case NOTHING:
    	}
    	
    }
}