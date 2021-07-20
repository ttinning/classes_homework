import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;

    @Before
    public void before() {
        library = new Library ("Tristan", 2);
        book = new Book("About A Boy", "Nick Hornby", "Comedy");
        book1 = new Book("The Night Manager", "John le Carre", "Drama");
    }

    @Test
    public void libraryHasNoBooksAtStart() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }
}
