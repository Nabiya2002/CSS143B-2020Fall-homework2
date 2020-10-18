/**
 * This is the base class for movies.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */
package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    // equals method for comparing variables
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book otherBook = (Book) o;
        return id.equals(otherBook.id) &&
                title.equals(otherBook.title) &&
                author.equals(otherBook.author);
    }
}
