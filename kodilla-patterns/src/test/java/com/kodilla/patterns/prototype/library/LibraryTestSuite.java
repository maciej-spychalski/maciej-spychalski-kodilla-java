package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library firstLibrary = new Library("First Library");

        IntStream.iterate(1, n -> n + 1)
                .limit(4)
                .forEach(n -> firstLibrary.getBooks().add(new Book("Title " + n, "Author " + n,
                        LocalDate.of(2000 + n, 12 - n, 28 - 2 * n))));


        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = firstLibrary.shallowCopy();
            shallowClonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = firstLibrary.deepCopy();
            deepClonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        firstLibrary.getBooks().add(new Book("Title 5", "Author 5",
                LocalDate.of(2020, 6, 14)));

        //Then
        System.out.println(firstLibrary);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(5, firstLibrary.getBooks().size());
        Assert.assertEquals(5, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
                Assert.assertEquals(firstLibrary.getBooks(), shallowClonedLibrary.getBooks());
        Assert.assertNotEquals(firstLibrary.getBooks(), deepClonedLibrary.getBooks());
    }
}
