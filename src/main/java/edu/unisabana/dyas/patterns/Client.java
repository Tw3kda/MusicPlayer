package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.adapters.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.interfaces.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop();
        
    }
}