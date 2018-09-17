/*
 * Exercise 3, page 492.
 */
package javaprogramming.chapter09Arrays;

public class Recording {
    String title;
    String artist;
    int playingTime;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getPlayingTime() {
        return playingTime;
    }
    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
    
    @Override
    public String toString() {
        return "Title: " + getTitle() +
                " --> Artist: " + getArtist() +
                " --> Playing Time: " + getPlayingTime();
    }
}