package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("House of Books");
        IntStream.iterate(1, n -> n + 1)
                .limit(12)
                .forEach(n -> library.books.add(new Book("The Book #" + n, "anonymous", LocalDate.of((1993 + n), n, 1))));
        //When

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setLibraryName("Shallow clone of House of Books in here..");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setLibraryName("Another House of Books in here.. cloned deeply");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepCloneLibrary.setLibraryName("Changed name of deeply cloned House of Books");
        deepCloneLibrary.books.add(new Book("Tajemnicza wyspa", "Verne", LocalDate.of(1973,2,5)));

        //Then
        System.out.println(library.getName());
        library.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(cloneLibrary.getName());
        cloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        System.out.println(deepCloneLibrary.getName());
        deepCloneLibrary.books.stream().forEach(n -> System.out.println(n.getTitle() + " " + n.getAuthor() + " " + n.getPublicationDate()));

        Assert.assertEquals(12, library.books.size());
        Assert.assertEquals(12, cloneLibrary.books.size());
        Assert.assertEquals(13,deepCloneLibrary.books.size());
    }
}
