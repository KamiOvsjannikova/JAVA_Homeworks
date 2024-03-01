package org.example.homework160224;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    private static final int MAX_CAPACITY = 5;
    private Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }
    private void init() {
        storage.put("Harry Potter", new Book("Harry Potter", 1997));
        storage.put("Lord of the ring", new Book("Lord of the ring", 1960));
        storage.put("Dune", new Book("Dune", 1980));
    }

    public void addBook(String name, int year) {
        if (storage.size() >= MAX_CAPACITY) {
            throw new StorageFullException("Not possible to add more books. Storage is full.");
        }
        storage.put(name, new Book(name, year));
    }
    public Book getBookByName(String name) {
        checkName(name);
        Book book = storage.get(name);
        if(book == null) {
            String message = "Book with name " + name + " not found in our book storage";
            throw new BookNotFoundException(message);
        }
        return book;
    }

    private void checkName(String name){
        if (name == null) {
            throw new IncorrectBookNameException("Name of book is null");
        }
        if (name.length() == 0) {
            throw new IncorrectBookNameException("Name of book is EMPTY");
        }
        char firstSymbol = name.charAt(0);
        if(!Character.isLetter(firstSymbol)) {
            throw new IncorrectBookNameException("Name of book starts with incorrect symbol = "+ firstSymbol);
        }
    }
}