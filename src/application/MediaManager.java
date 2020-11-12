package application;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MediaManager {
	static MediaPlayer media_player;
	static Media audio_media;
	
	static void load_audio(File audio_source) {
		audio_media = new Media(audio_source.getAbsolutePath());
		media_player = new MediaPlayer(audio_media);
		
	}
}
