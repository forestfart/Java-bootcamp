package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.LibraryAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        // Given
        Book book1 = new Book ("Anonymous", "Title1", 1985, "GoodBooks");
        Book book2 = new Book ("Anonymous", "Title2", 1986, "GoodBooks");
        Book book3 = new Book ("Anonymous", "Title3", 1987, "GoodBooks");
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(book1);
        booksLibraryA.add(book2);
        booksLibraryA.add(book3);

        LibraryAdapter libraryAdapter = new LibraryAdapter();

        // When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksLibraryA);

        // Then
        assertEquals(1986, publicationYearMedian);
    }
}
