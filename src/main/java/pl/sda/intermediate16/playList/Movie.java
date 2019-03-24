package pl.sda.intermediate16.playList;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Movie extends Playable{

    private String title;

    @Override
    protected String play() {
        return "Movie: " + title ;
    }
}
