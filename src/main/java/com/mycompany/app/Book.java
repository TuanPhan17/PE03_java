package com.mycompany.app;          // Defines the package this class belongs to

public class Book {                 // Declares the Book class

    int id;                         // Unique Id for book
    String title;                   // Stores the title of the book
    String author;                  // Stores the author of the book

    // Constructor: runs when a new Book object is created
    public Book(String title, String author, int id) {
        this.id = id;               // Assigns the provided id to the book
        this.title = title;         // Assigns the provided title to the book
        this.author = author;       // Assigns the provided author to the book
    }

    // Method to display book details to the console
    void displayInfo() {
        System.out.println(
                "Title: " + title +     // Prints the book title
                        ", Author : " + author + // Prints the book author
                ", ID :" + id           // Prints the book ID
        );
    }
}
