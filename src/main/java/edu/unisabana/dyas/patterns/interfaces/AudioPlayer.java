package edu.unisabana.dyas.patterns.interfaces;

// Interfaz para el reproductor de audio
public interface AudioPlayer {
    void play(String audioType, String fileName);
    void stop();
}