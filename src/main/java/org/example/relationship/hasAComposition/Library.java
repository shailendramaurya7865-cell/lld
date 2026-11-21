package org.example.relationship.hasAComposition;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> bookList = new ArrayList<>();

    Library() {
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
        bookList.add(new Book("Book3"));
        bookList.add(new Book("Book4"));
        bookList.add(new Book("Book5"));
    }

    public void addBook(Book book) {
        bookList.add(book);
    }
    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
