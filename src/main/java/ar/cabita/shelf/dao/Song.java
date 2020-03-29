package ar.cabita.shelf.dao;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private int number;
    private String duration;
    private List<String> featuring;

    public Song(int number, String duration, List<String> featuring) {
        this.number = number;
        this.duration = duration;
        this.featuring = featuring;
    }

    public Song() {
        this.featuring = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDuration() {
        return duration;
    }

    public List<String> getFeaturing() {
        return new ArrayList<>(featuring);
    }
}
