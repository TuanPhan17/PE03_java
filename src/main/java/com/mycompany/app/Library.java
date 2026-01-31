package com.mycompany.app;                 // Defines the package for this class

public class Library {                     // Declares the Library class

    Book[] books;                          // Array to store Book objects
    int totalBooks = 0;                    // Tracks the current number of books in the library
    static int librarySize = 5;             // Maximum number of books the library can hold
    static int nextBookId = 1;

    // Constructor: initializes the library with a fixed-size array
    public Library() {
        books = new Book[librarySize];     // Creates the Book array using librarySize
    }

    // Method to add a new book to the library
    void addBook(String title, String author) {
        if (totalBooks < books.length) {   // Checks if there is space in the library
            books[totalBooks] = new Book(title, author, nextBookId); // Creates and stores a new Book
            totalBooks++;   // Increments the total book count
            nextBookId ++;  // Increments ID for next book
        } else {
            System.out.println("Library is full, cannot add more books."); // Error message if full
        }
    }

    // Method to display all books currently in the library
    void displayBooks() {
        System.out.println("\nLibrary Books:"); // Prints header for book list
        for (int i = 0; i < totalBooks; i++) {  // Loops through stored books
            books[i].displayInfo();              // Displays each book's details
        }
    }

    // Method to search for a book by its title
    void searchBook(String title) {
        for (int i = 0; i < totalBooks; i++) {  // Loops through all stored books
            if (books[i].title.equalsIgnoreCase(title)) { // Compares titles ignoring case
                System.out.println("Book Found:"); // Prints success message
                books[i].displayInfo();            // Displays found book details
                return;                            // Exits method after finding book
            }
        }
        System.out.println("Book not found.");     // Message if no match is found
    }

    // Static method to display the library's maximum capacity
    static void libraryCapacity() {
        System.out.println(
                "Library can hold up to " + librarySize + " books." // Prints library capacity
        );
    }
}
