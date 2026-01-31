package com.mycompany.app;

public class App {
    public static void main(String[] args) {

        Library library = new Library(); // Create library

        // Add books to the library
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("1984", "George Orwell");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        // Display all books
        library.displayBooks();

        // Search for a book
        library.searchBook("1984");

        // Check library capacity
        Library.libraryCapacity();
    }
}
