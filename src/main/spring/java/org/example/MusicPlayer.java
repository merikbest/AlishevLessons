package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    private Music music;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());
    }
}
