package homework02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicalPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private Music music1;
    private Music music2;

    public MusicalPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

//    public MusicalPlayer(@Qualifier("classicalMusic") Music music1,
//                         @Qualifier("rockMusic")Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

//    public MusicalPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void playMusic() {
//        System.out.println(music1.getSong());
//        System.out.println(music2.getSong());
//    }

    public void playMusic() {
        Random random = new Random();
        int n = random.nextInt(2);
        System.out.println(musicList.get(n).getSong());
    }
}