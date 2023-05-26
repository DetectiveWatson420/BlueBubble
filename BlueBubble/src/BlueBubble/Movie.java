package BlueBubble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String director;
    private String actor;
    private String genre;
    
    public Movie() {
    	this.title = null;
        this.director = null;
        this.actor = null;
        this.genre = null;
    }
    
    public Movie(String title, String director, String actor, String genre) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.genre = genre;
    }
    
    public String toString() {
    	return "A " + genre + " movie named: \n" + title + ":\n played BY: " + actor + "\n Directed BY: " + director;
    }
    
    // Getters and setters (if needed)
    
    public String getTitle() {
    	return director;
    }
    
    public String getDirector() {
    	return title;
    }
    
    public String getActor() {
    	return actor;
    }
    
    public String getGenre() {
    	return genre;
    }
    
    public List<Movie> readMoviesFromCSV(String filename) {
        List<Movie> movies = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data.length == 4) {
                    String title = data[0];
                    String director = data[1];
                    String actor = data[2];
                    String genre = data[3];
                    
                    Movie movie = new Movie(title, director, actor, genre);
                    movies.add(movie);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return movies;
    }
}