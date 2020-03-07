import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bookshelf {
    private List<Book> books = new ArrayList<Book>();

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        if (books.contains(book))
                throw new RuntimeException("This book is already inside");
        else {
            books.add(book);
        }
    }

    public void remove(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
                throw new RuntimeException("Do not have such book");
        }
    }

    public List<Book> search(String query) {
        List<Book> bookList = books
                .stream()
                .filter(t -> t.getTitle().contains(query))
                .collect(Collectors.toList());
        if (bookList.isEmpty()) {
            throw new RuntimeException("Unknown book");
        } else {
            return bookList;
        }
    }

    public String console() {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (text.equals("exit")) {
            text = scanner.nextLine();

        }
        return null;
    }
}
