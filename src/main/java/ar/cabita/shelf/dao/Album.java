package ar.cabita.shelf.dao;

import java.util.ArrayList;
import java.util.List;

public class Album extends Item {
    private List<Song> songs;

    public Album(String artist, String name, int year, String genre, String itemType) {
        super(artist, name, year, genre, itemType);
        this.songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return new ArrayList<>(this.songs);
    }

    public void addSong(Song song) {
        if (song != null) {
            this.songs.add(song);
        }
    }
}
