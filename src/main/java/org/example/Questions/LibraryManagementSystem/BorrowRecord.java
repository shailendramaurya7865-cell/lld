package org.example.Questions.LibraryManagementSystem;

import java.time.LocalDate;
import java.util.Date;

public class BorrowRecord {
    public Book book;
    public Member member;
    public LocalDate borrowDate;
    public LocalDate returnDate;

    public BorrowRecord(Book book, Member member, LocalDate borrowDate, LocalDate returnDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
}
