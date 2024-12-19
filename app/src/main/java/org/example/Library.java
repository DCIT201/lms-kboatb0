package org.example;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getYearPublished());
        }
    }

     public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found book: " + book.getTitle());
                return book;
            }
        }
        return null;

     }

}
