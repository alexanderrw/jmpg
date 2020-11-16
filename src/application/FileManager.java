package application;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileManager {
	static File audio_file;
	static File temp_audio_file;
	
	static void open_audio() {
		FileChooser file_chooser = new FileChooser();
		file_chooser.setTitle("Open audio...");
		ExtensionFilter audio_filter = new ExtensionFilter("Audio Files", "*.mp3");
		file_chooser.getExtensionFilters().add(audio_filter);
		file_chooser.setSelectedExtensionFilter(audio_filter);
		
		// Prevents unloading of currently open audio file if the user exits file chooser.
		temp_audio_file = file_chooser.showOpenDialog(Controller.mainstage);
		if (temp_audio_file != null) {
			audio_file = temp_audio_file;
		}
	}
}
