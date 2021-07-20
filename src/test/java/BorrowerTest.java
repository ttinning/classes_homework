import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;
    private Library library;

    @Before
    public void before() {
        book = new Book("About A Boy", "Nick Hornby", "Comedy");
        borrower = new Borrower("Tristan");
        library = new Library("Edinburgh", 2);
    }

    @Test
    public void borrowerHasNoBooksAtStart() {
        assertEquals(0, borrower.getCount());
    }

    @Test
    public void borrowCanAddBook() {
        borrower.addToBookList(book);
        assertEquals(1, borrower.getCount());
    }

    @Test
    public void borrowerCanRemoveBook() {
        borrower.addToBookList(book);
        borrower.removeBook(book);
        assertEquals(0, borrower.getCount());
    }
}

