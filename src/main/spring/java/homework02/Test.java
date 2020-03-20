package homework02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicalPlayer musicalPlayer = context.getBean("musicalPlayer", MusicalPlayer.class);
        musicalPlayer.playMusic();
        System.out.println(musicalPlayer.getName());
        System.out.println(musicalPlayer.getVolume());
        context.close();
    }
}
