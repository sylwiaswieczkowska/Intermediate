package pl.sda.intermediate16.playList;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.sda.intermediate16.playList.PlayMode.*;

public class PlayList extends Playable {

    private List<Playable> playables = new ArrayList<>();
    private PlayMode playMode;

    public PlayList(PlayMode playMode) {
        this.playMode = playMode;
    }

    protected void addToPlayList(Playable playable){
        playables.add(playable);
    }

    @Override
    protected String play() {
        if (playMode == SEQUENTIAL) {//enum jest singeltonem mozna tez zamiast equals wykorzystać ==
            return collectTitles(playables);
        } else if (playMode == LOOP) {
            String result = "";
            // IntStream.range(1,11).forEach(e ->);nieskonczyny ze streamem
            for (int i = 0; i < 10; i++) {
                result = result + collectTitles(playables);
            }
            return result;
        }else if(playMode == RANDOM) {
            List<Playable> tempList = new ArrayList<>(playables);
            Collections.shuffle(tempList);
            return collectTitles(tempList);
        }
        return "ERROR!!";
      }

    private String collectTitles(List<Playable> playables) {
        return playables.stream()
                .map(Playable::play)
                .collect(Collectors.joining("\n"));
    }
}
