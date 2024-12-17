package librarymanagement;

import java.util.Scanner;

public class LibrarySystem {
    // Marked as final since they are not reassigned after initialization
    private static final Library library = new Library();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    viewBooks();
                    break;
                case 4:
                    searchBook();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the library system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static void showMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add a Book");
        System.out.println("2. Remove a Book");
        System.out.println("3. View All Books");
        System.out.println("4. Search a Book");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String isbn = scanner.nextLine();

        Book book = new Book(title, author, isbn);
        library.addBook(book);
    }

    public static void removeBook() {
        System.out.print("Enter the ISBN of the book to remove: ");
        String isbn = scanner.nextLine();
        library.removeBook(isbn);
    }

    public static void viewBooks() {
        library.viewBooks();
    }

    public static void searchBook() {
        System.out.print("Enter the ISBN of the book to search: ");
        String isbn = scanner.nextLine();
        library.searchBook(isbn);
    }
}





