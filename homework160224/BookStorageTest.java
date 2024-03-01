package org.example.homework160224;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {
    private BookStorage storage = new BookStorage();

    @Test
    void getBookByNameWhenBookExists() {
        String bookName = "Lord of the ring";
        Book bookByName = storage.getBookByName(bookName);
        assertEquals(bookName, bookByName.getName());
    }

    @Test
    void getBookByNameWhenBookNotExists() {
        String bookName = "Lord";
        assertThrows(BookNotFoundException.class, () ->
                storage.getBookByName(bookName));

    }

    @Test
    void getBookByNameWhenBookNameIsNull() {

        assertThrows(IncorrectBookNameException.class, () ->
                storage.getBookByName(null));

    }

    @Test
    void getBookByNameWhenBookNameIsEmpty() {

        assertThrows(IncorrectBookNameException.class, () ->
                storage.getBookByName(""));

    }

    @Test
    void getBookByNameWhenBookNameStartsWithSymbol() {
        String incorrectFirstSymbol = "-Dune";

        assertThrows(IncorrectBookNameException.class, () ->
                storage.getBookByName(incorrectFirstSymbol));


    }

}