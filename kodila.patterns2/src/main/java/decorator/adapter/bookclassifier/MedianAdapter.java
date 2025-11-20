package decorator.adapter.bookclassifier;

import decorator.adapter.bookclassifier.librarya.*;
import decorator.adapter.bookclassifier.libraryb.Book;
import decorator.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<decorator.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = new HashMap<>();
        for (decorator.adapter.bookclassifier.librarya.Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()), new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
