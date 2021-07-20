import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookList;

    public Borrower(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public int getCount() {
        return this.bookList.size();
    }

    public void addToBookList(Library library, Book book) {
        Book borrowed = library.loanBook(book);
        this.bookList.add(borrowed);
    }

    public void removeBook(Book book) {
        this.bookList.remove(0);
    }
}
