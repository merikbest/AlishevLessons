package homework01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RetroMusicList implements MusicList {
    private List<String> retroMusicList = new ArrayList<>();

    @Override
    public String getSong(int n) {
        retroMusicList.add("Retro Music Song 1");
        retroMusicList.add("Retro Music Song 2");
        retroMusicList.add("Retro Music Song 3");
        return retroMusicList.get(n);
    }
}
