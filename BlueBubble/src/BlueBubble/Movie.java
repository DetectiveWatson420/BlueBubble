package BlueBubble;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String director;
    private String actor;
    private String genre;

    // Constructor
    public Movie(String name, String director, String actor, String genre) {
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.genre = genre;
    }

    // Getters and setters (optional)

    public static void main(String[] args) {
        String csvFile = "/Users/209580/Documents/movies.csv";  // Specify the CSV file path
        String line;
        String csvDelimiter = ",";  // Specify the CSV delimiter
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the CSV file line by line
            while ((line = br.readLine()) != null) {
                String[] movieData = line.split(csvDelimiter);

                // Extract movie information from CSV
                String name = movieData[0];
                String director = movieData[1];
                String actor = movieData[2];
                String genre = movieData[3];

                // Create a new Movie object using the extracted information
                Movie movie = new Movie(name, director, actor, genre);

                // Add the movie object to the list
                movies.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the movies or perform any other operations with the movie objects
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " | " + movie.getDirector() + " | " + movie.getActor() + " | " + movie.getGenre());
        }
    }

    // Getters and setters (optional)

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    public String getGenre() {
        return genre;
    }
}
