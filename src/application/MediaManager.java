package application;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MediaManager {
	static MediaPlayer media_player;
	static Media audio_media;
	
	static boolean audio_is_loaded() {
		if (media_player != null) {
			return true;
		} else {
			Controller.error_alert.setTitle("Null MediaPlayer");
			Controller.error_alert.setHeaderText(null);
			Controller.error_alert.setContentText("No audio is loaded!");
			Controller.error_alert.show();
			return false;
		}
	}
	
	static void load_audio(File audio_source) {
		audio_media = new Media(audio_source.toURI().toString());
		media_player = new MediaPlayer(audio_media);
	}
	
	static void set_volume(double percentage) {
		if (media_player != null) {
			media_player.setVolume(percentage / 100);
		}
	}
	
	static enum Action {
		PLAY,
		PAUSE,
		NOTHING
	}
	
	static Action play_pause_toggle() {
		if (!audio_is_loaded()) {return Action.NOTHING;}
		
		switch (media_player.getStatus()) {
		
		case PLAYING:
			media_player.pause();
			return Action.PAUSE;
		case STOPPED:
		case PAUSED:
		case READY:
			media_player.play();
			return Action.PLAY;
		default:
			System.out.println(media_player.getStatus());
			return Action.NOTHING;
		
		}
	}
	
}
