package ar.cabita.shelf;

import ar.cabita.shelf.dao.Album;
import ar.cabita.shelf.dao.Book;
import ar.cabita.shelf.dao.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTests {

    private Album testAlbum;

    @BeforeAll
    static void initConfiguration() {
        // testAlbum = new Album("Eminem", "The Eminem Show", 2002, "Rap");
    }

    @Test
    void Check_AlbumHasSongs_True() {
        testAlbum = new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album");
        assertTrue(this.testAlbum.getSongs().isEmpty());
    }

    @Test
    void Add_AlbumSongs_Exception() {
        assertNotEquals(null, new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album").getSongs());
        // assertEquals(null, this.testAlbum.getSongs());
    }

    @Test
    void Equal_TwoAlbums() {
        assertTrue(new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album").equals(new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album")));
        assertFalse(new Album("Eminem", "Marshall Mathers LP", 2002, "Rap", "Album").equals(new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album")));
        assertFalse(new Album("Eminem", "Marshall Mathers LP", 2002, "Rap", "Album").equals(null), "One object is null");
    }

    @Test
    void Equal_DifferentInstance() {
        Item a = new Album("Eminem", "The Eminem Show", 2002, "Rap", "Album");
        Item b = new Book("Dan Brown", "The Eminem Show", 2004, "Adventure", "Album");
        assertTrue(a.equals(b));
    }
}
