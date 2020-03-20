package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScoupe {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");

//        MusicPlayerTwo musicPlayerTwo = context.getBean("musicPlayerTwo", MusicPlayerTwo.class);
//        musicPlayerTwo.playMusic();
//        context.close();
        MusicPlayerTwo musicPlayerTwo = context.getBean("musicPlayerTwo", MusicPlayerTwo.class);
        System.out.println(musicPlayerTwo.getName());
        System.out.println(musicPlayerTwo.getVolume());


        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        boolean clasicalMusic = classicalMusic1 == classicalMusic2;
        System.out.println(clasicalMusic);
        context.close();
    }
}