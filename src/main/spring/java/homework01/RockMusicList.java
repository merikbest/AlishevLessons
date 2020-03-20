package homework01;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusicList implements MusicList {
    private List<String> rockMusicList = new ArrayList<>();

    @Override
    public String getSong(int n) {
        rockMusicList.add("Rock Music Song 1");
        rockMusicList.add("Rock Music Song 2");
        rockMusicList.add("Rock Music Song 3");
        return rockMusicList.get(n);
    }
}
