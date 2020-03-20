package homework01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private MusicList music1;
    private MusicList music2;
    private MusicList music3;

    @Autowired
    public MusicPlayer(@Qualifier("clasicMusicList") MusicList music1,
                       @Qualifier("rockMusicList") MusicList music2,
                       @Qualifier("retroMusicList") MusicList music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(MusicE musicE) {
        Random random = new Random();
        int n = random.nextInt(3);
        if (musicE == MusicE.CLASSICAL) {
            System.out.println(music1.getSong(n));
        } else if (musicE == MusicE.ROCK) {
            System.out.println(music2.getSong(n));
        } else {
            System.out.println(music3.getSong(n));
        }
    }
}