package homework02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("homework02")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RetroMusic retroMusic() {
        return new RetroMusic();
    }

    @Bean
    public List<Music> listMusic() {
        return Arrays.asList(classicalMusic(), rockMusic(), retroMusic());
    }

    @Bean
    public MusicalPlayer musicalPlayer() {
        return new MusicalPlayer(listMusic());
    }
}
