package store.movie;

import java.time.LocalDate;

public class Movie {

private String id;
private Integer rating;
private LocalDate releaseDate;
private Double price;

public Movie(String id, Integer rating, LocalDate releaseDate, Double price){
    this.id = id;
    this.rating = rating;
    this.releaseDate = releaseDate;
    this.price = price;
}
public String getId(){
    return id;
}
public Integer getRating(){
    return rating;
}
public LocalDate getReleaseDate(){
    return getReleaseDate();
}
public Double getPrice(){
    return  price;
}
}
