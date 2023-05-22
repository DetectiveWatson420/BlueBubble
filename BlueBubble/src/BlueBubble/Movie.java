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
    
    public Movie(String title, String director, String actor, String genre) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.genre = genre;
    }
    
    // Getters and setters (if needed)
    //Pee pee poo poo man
    
    public static List<Movie> readMoviesFromCSV(String filename) {
        List<Movie> movies = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                if (data.length == 4) {
                    String title = data[0].trim();
                    String director = data[1].trim();
                    String actor = data[2].trim();
                    String genre = data[3].trim();
                    
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