import java.util.Scanner;
import java.util.ArrayList;

class Book{
    private String bookName;
    private String author;
    private boolean bookAvaliable;

    public Book(String bookName, String author, boolean bookAvaliable) {
        this.bookName = bookName;
        this.author = author;
        this.bookAvaliable = bookAvaliable;
    }

    
}

class Library{
    private ArrayList<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title) {
        // Logic to issue a book
    }

    public void returnBook(String title) {
        // Logic to return a book
    }

    public void viewBooks() {
        // Logic to display all books
    }
}


public class LibraryManagementSystem {
    
}
