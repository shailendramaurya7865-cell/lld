package org.example.relationship.hasAAggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
        Library library = new Library(bookList);
        library.getBookList();

    }
}
