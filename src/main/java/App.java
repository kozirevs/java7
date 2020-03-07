import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "Story Of My Life", "Aleksandrs", 100);
        Book book2 = new Book("1234534566", "Story Of My Life", "Kozirevs", 200);
        Book book3 = new Book("1234567889", "Story Of My Life", "Georgs", 300);
        Book book4 = new Book("1234876543", "Story Of My Life", "User", 400);

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
        bookshelf.add(book4);

        bookshelf.getBooks().forEach(book -> log.info(book.getTitle()));

        System.out.println();
        List<String> list = bookshelf.getBooks().stream()
                .filter(t -> t.getPages() > 100)
                .map(t -> t.getAuthor() + t.getTitle())
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println();

        List<Book> bookList = bookshelf.search("Stories");
        System.out.println(bookList);

        System.out.println("\n\n****************************\n\n");

        try {
            throw new RuntimeException("Nereala kluda");
        } catch (RuntimeException e) {
            log.error("Java7 Maven project", e);
        }

        log.info("Java7 Maven project");
        log.trace("Java7 Maven project");
        log.debug("Java7 Maven project");
        log.warn("Java7 Maven project");
        log.error("Java7 Maven project");

    }
}
