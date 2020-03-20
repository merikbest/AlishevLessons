package homework01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClasicMusicList implements MusicList {
    private List<String> clasicMusicList = new ArrayList<>();

    {
        clasicMusicList.add("Clasic Music Song 1");
        clasicMusicList.add("Clasic Music Song 2");
        clasicMusicList.add("Clasic Music Song 3");
    }

    @Override
    public String getSong(int n) {
        return clasicMusicList.get(n);
    }
}
