package application;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class FileManager {
	static File audio_file;
	static boolean is_open_dialog = false;
	
	static void open_audio() {
		if (!is_open_dialog) {
			FileChooser file_chooser = new FileChooser();
			file_chooser.setTitle("Open audio...");
			ExtensionFilter audio_filter = new ExtensionFilter("Audio Files", "*.mp3");
			file_chooser.getExtensionFilters().add(audio_filter);
			file_chooser.setSelectedExtensionFilter(audio_filter);
			
			is_open_dialog = true;
			audio_file = file_chooser.showOpenDialog(null);
			is_open_dialog = false;
		}
	}
}
