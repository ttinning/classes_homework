import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book ("About A Boy", "Nick Hornby", "Comedy");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("About A Boy", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Nick Hornby", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Comedy", book.getGenre());
    }

}
