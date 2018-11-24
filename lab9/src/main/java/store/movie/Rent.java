package store.movie;

import java.util.ArrayList;
import java.util.List;

public class Rent {
    private String days;
    private List<Movie> movies;

    public Rent(String days){
        this.days = days;
        this.movies = new ArrayList<>();
    }

}
