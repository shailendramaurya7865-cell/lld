package org.example.Questions.LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, Book> books = createBooks();
        Library library = new Library(books);

        Member member1 = new Member("Shailendra", 111);
        Member member2 = new Member("Abhishek", 222);

        library.printAvailableBooks();

        library.borrowBook("B001", member1);
        library.printAvailableBooks();

        library.borrowBook("B002", member2);
        library.printAvailableBooks();

        library.returnBook("B001");
        library.printAvailableBooks();


    }

    private static Map<String, Book> createBooks() {
        Map<String, Book> books = new HashMap<>();
        Book book1 = new Book("B001", "Book1", "author1");
        Book book2 = new Book("B002", "Book2", "author2");
        Book book3 = new Book("B003", "Book3", "author3");
        books.put("B001", book1);
        books.put("B002", book2);
        books.put("B003", book3);
        return books;
    }
}
