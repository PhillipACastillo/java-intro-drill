import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    String name;
    ArrayList<Song> songs = new ArrayList<>();

    Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String[] songNames() {
        ArrayList<String> songTitles = new ArrayList<>();
        for (Song song : songs) {
            songTitles.add(song.title);
        }
        return songTitles.toArray(new String[0]);
    }

    public int totalDuration() {
        int duration = 0;
        for (Song song: songs) {
            duration += song.durationInSeconds;
        }
        return duration;
    }

    public void swap(Song song1, Song song2) {
        int song1Idx = songs.indexOf(song1);
        int song2Idx = songs.indexOf(song2);
        Collections.swap(songs, song1Idx, song2Idx);
    }

    public void removeSong(Song song) {
        songs.remove(song);

    }
}
