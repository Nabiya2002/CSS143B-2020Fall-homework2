/**
 * This is the base class for movies.
 *
 * Author: Nabiya Alam
 * Version: 1.0.0
 * Date: 10/17/2020
 */
package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.rating = rating;
    }

    // copy constructor
    public Movie(Movie anotherMovie) {
        this.id = anotherMovie.id;
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
    }

    // equals method for comparing variables
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie otherMovie = (Movie) o;
        return rating.equals(otherMovie.rating) &&
                title.equals(otherMovie.title) &&
                id.equals(otherMovie.id);
    }
}
