package org.example.Questions.LibraryManagementSystem;

public class Book {
    String bookId;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    String title;
    String author;
    Member borrowedBy;
    BookStatus bookStatus;


    public void setBorrowedBy(Member borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Member getBorrowedBy() {
        return borrowedBy;
    }



    public Book(String bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.title = bookName;
        this.author = bookAuthor;
        this.bookStatus = BookStatus.AVAILABLE;
    }
}
