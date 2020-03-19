package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScoupe {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");

        Music music1 = context.getBean("someRockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer player1 = new MusicPlayer(music1);
        MusicPlayer player2 = new MusicPlayer(music2);
        player1.playMusic();
        player2.playMusic();
        context.close();
    }
}
