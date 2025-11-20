package decorator.adapter.bookclassifier;

import decorator.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest() {
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2000, "Signature 1"));
        books.add(new Book("Author 2", "Title 2", 2001, "Signature 2"));
        books.add(new Book("Author 3", "Title 3", 2002, "Signature 3"));
        books.add(new Book("Author 4", "Title 4", 2003, "Signature 4"));
        books.add(new Book("Author 5", "Title 5", 2004, "Signature 5"));

        int median = medianAdapter.publicationYearMedian(books);

        assertEquals(2002, median);
    }
}
