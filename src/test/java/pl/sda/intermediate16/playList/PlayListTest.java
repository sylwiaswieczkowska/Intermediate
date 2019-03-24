package pl.sda.intermediate16.playList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayListTest {

    private Music music1 = new Music("Metallica","Sad but true");
    private Music music2 = new Music("Kult","6 lat pozniej");
    private Music music3 = new Music("U2","With or without you");
    private Music music4 = new Music("Perfect","Autobiografia");
    private Music music5 = new Music("David Bowie","Lazarus");
    private Movie movie1 = new Movie("Bohemian Rhapsody");
    private Movie movie2 = new Movie("Kevin sam w domu");
    private Movie movie3 = new Movie("Janosik");
    private Movie movie4 = new Movie("Sami swoi");


    @Test
    void shouldWorkProperlyWithRandomMode(){
        PlayList playList = new PlayList(PlayMode.RANDOM);
        playList.addToPlayList(music1);
        playList.addToPlayList(music2);
        playList.addToPlayList(music3);
        playList.addToPlayList(music4);
        playList.addToPlayList(music5);
        playList.addToPlayList(movie1);
        playList.addToPlayList(movie2);
        playList.addToPlayList(movie3);
        playList.addToPlayList(movie4);

        System.out.println(playList.play());
    }
    @Test
    void shouldWorkProperlyWithRandomModeWithSubPlayList(){
        PlayList playList = new PlayList(PlayMode.RANDOM);
        playList.addToPlayList(music1);
        playList.addToPlayList(music2);
        playList.addToPlayList(music3);
        playList.addToPlayList(movie1);
        playList.addToPlayList(movie2);

        PlayList subPlayList = new PlayList(PlayMode.SEQUENTIAL);
        subPlayList.addToPlayList(music4);
        subPlayList.addToPlayList(music5);
        subPlayList.addToPlayList(movie3);
        //playList.addToPlayList(subPlayList); <- StackOverflowError nie jestesmy w stanie tego przewidiec
        playList.addToPlayList(subPlayList);

        System.out.println(playList.play());
    }

}