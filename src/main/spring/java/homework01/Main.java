package homework01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicE.RETRO);
        musicPlayer.playMusic(MusicE.ROCK);
        musicPlayer.playMusic(MusicE.CLASSICAL);
        context.close();
    }
}
