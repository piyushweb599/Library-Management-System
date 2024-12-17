package librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Remove a book from the library by ISBN
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed with ISBN: " + isbn);
    }

    // View all books in the library
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Search a book by ISBN
    public void searchBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }
}


