package model;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDB {
    private Map<String, Theatre> theatres;
    private Map<String, Screen> screens;
    private Map<String, Show> shows;
    private Map<String, Booking> bookings;
    private Map<String, Seat> seats;
    private Map<String, Movie> movies;
    private static InMemoryDB instance;

    private InMemoryDB(){
        theatres = new HashMap<>();
        screens = new HashMap<>();
        shows = new HashMap<>();
        bookings = new HashMap<>();
        seats = new HashMap<>();
        movies = new HashMap<>();
    }

    public static InMemoryDB getInstance(){
        if(instance==null){
            instance = new InMemoryDB();
        }
        return instance;
    }

    public Map<String, Theatre> getTheatres() {
        return this.theatres;
    }

    public Map<String, Screen> getScreens() {
        return screens;
    }

    public Map<String, Show> getShows() {
        return shows;
    }

    public Map<String, Booking> getBookings() {
        return bookings;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }

    public Map<String, Movie> getMovies() {
        return movies;
    }
}
