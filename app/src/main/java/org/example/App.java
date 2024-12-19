/*
 * This should be your main class where all your objects will be created
 */
package org.example;


public class App {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("C++", "Bjarne", 1995);
        Book book2 = new Book("Java", "Horst", 2005);
        Book book3 = new Book("Python", "Polo", 2010);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book1);
        library.displayBooks();
        library.findBook("C++");
        
        Patron patron = new Patron("Razak");
        System.out.println("Patron: " + patron.getName());
    }

}
