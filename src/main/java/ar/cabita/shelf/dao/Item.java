package ar.cabita.shelf.dao;

public class Item {
    protected String artist;
    protected String name;
    protected int year;
    protected String genre;
    protected String itemType;

    public Item(String artist, String name, int year, String genre, String itemType) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.itemType = itemType;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Item item = (Item) obj;
        return item.getName().toLowerCase().equals(this.name.toLowerCase()) && item.getItemType().equals(this.itemType);
    }

    public String getItemType() {
        return this.itemType;
    }
}
