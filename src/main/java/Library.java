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
}
