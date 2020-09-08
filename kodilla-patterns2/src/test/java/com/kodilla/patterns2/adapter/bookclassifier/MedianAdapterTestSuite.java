package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Book1", "Author1", 2010, "12345"));
        books.add(new Book("Book2", "Author2", 1998, "45486"));
        books.add(new Book("Book3", "Author3", 2018, "54893"));
        books.add(new Book("Book4", "Author4", 2020, "46862"));
        books.add(new Book("Book5", "Author5", 1902, "14643"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Than
        assertEquals(2010, median);
    }
}
