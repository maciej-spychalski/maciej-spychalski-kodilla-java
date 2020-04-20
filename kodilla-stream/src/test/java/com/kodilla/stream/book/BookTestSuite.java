package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
//        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
//                .filter(n -> books.get(n).getYearOfPublication() > 2007)
//                .map(n -> 1)
//                .sum();

        // Możemy jednak jeszcze bardziej uprościć naszą funkcyjną "pętlę for", wykorzystując do tego celu operację
        // terminalną count() strumienia. Operacja ta jest kolektorem skalarnym i zwraca liczbę typu long. W przypadku
        // zastosowania metody count(), nie musimy mapować indeksów na "jedynki" — chcemy po prostu sprawdzić liczbę
        // indeksów w strumieniu po filtrze.
        // Zwróć uwagę, że musimy również zmienić typ zmiennej numberOfBooksPublicatedAfter2007 na typ long
        // (co wynika z tego, że kolektor count() zwraca wynik typu long):
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();

        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }


}
