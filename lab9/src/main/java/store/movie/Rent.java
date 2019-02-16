package store.movie;

import java.util.ArrayList;
import java.util.List;

public class Rent {
    private int days;
    private List<Movie> movies;

    public Rent(int days) {
        this.days = days;
        this.movies = new ArrayList<>();
    }

    public Integer getDays() {
        return days;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }
}
