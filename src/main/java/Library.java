import java.util.ArrayList;

public class Library {

    private String name;
    private Integer capacity;
    private ArrayList<Book> books;

    public Library(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (books.size() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book loanBook(Book book) {
        int bookIndex = this.books.indexOf(book);
        if (bookIndex >= 0) {
            return this.books.remove(bookIndex);
        }
        return null;
    }
}
