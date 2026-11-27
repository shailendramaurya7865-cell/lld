package org.example.Questions.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Library {
    Map<String, Book> allBooks;
    List<BorrowRecord> borrowRecords = new ArrayList<>();

    public Library(Map<String, Book> allBooks) {
        this.allBooks = allBooks;
    }

    public void borrowBook(String bookId, Member member) {
        Book book = allBooks.get(bookId);
        if (null == book) {
            System.out.println("Book not found");
            return;
        }

        if (book.getBookStatus() == BookStatus.BORROWED) {
            System.out.println("Book is already borrowed by " + book.getBorrowedBy().name);
            return;
        }
        book.setBookStatus(BookStatus.BORROWED);
        book.setBorrowedBy(member);
        borrowRecords.add(new BorrowRecord(book, member, LocalDate.now(), null));
        System.out.println("Book " + book.title + " is borrowed by " + member.name);
    }

    public void returnBook(String bookId) {
        if (null == bookId || bookId.isBlank()) {
            System.out.println("It is not a valid book");
            return;
        }
        Book book = allBooks.get(bookId);
        if (book == null) {
            System.out.println("Wrong book return is not allowed");
            return;
        }
        System.out.println("Book " + book.title + " is returned by " + book.getBorrowedBy().name);
        book.setBookStatus(BookStatus.AVAILABLE);
        book.setBorrowedBy(null);
        BorrowRecord activeRecord = findActiveRecord(bookId);
        activeRecord.returnDate = LocalDate.now();
    }

    private BorrowRecord findActiveRecord(String bookId) {
        return borrowRecords.stream()
                .filter(record ->
                        record.book.bookId.equals(bookId)
                                && record.returnDate == null)
                .findFirst()
                .orElseThrow();
    }


    public void printAvailableBooks() {
        for(Map.Entry<String , Book> entry : allBooks.entrySet()) {
            Book value = entry.getValue();
            if(null == value.getBookStatus() || value.getBookStatus() == BookStatus.AVAILABLE) {
                System.out.print("value = " + value + ", ");
            }
        }
    }
}
