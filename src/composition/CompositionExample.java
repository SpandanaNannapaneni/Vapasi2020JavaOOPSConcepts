package composition;


// Java program to illustrate
// the concept of Composition

import java.io.*;
import java.util.*;

// class book
class Book {

    public String title;
    public String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;
    }
}

// Library class contains
// list of books.
class Library {

    // reference to refer to list of books.
    private final List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    // Getting total number of books
    public List<Book> getTotalBooksInLibrary() {

        return books;
    }
}


class CompositionExample {
    public static void main(String[] args) {

        // Creating the Objects of Book class.
        Book b1
                = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
                = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                "Herbert Schildt");

        // Creating the list which contains the
        // no. of books.
        List<Book> book = new ArrayList<Book>();
        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library library = new Library(book);

        List<Book> books = library.getTotalBooksInLibrary();

        for (Book i : books) {

            System.out.println("Title : " + i.title
                    + " and "
                    + " Author : " + i.author);
        }
    }
}