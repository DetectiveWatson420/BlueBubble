package BlueBubble;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		displayBBLogo();
		surveyTaker mySurvey = new surveyTaker("What genre do you want?", "What Director do you want?", "What actor do you want?");
		ArrayList<String> responses = mySurvey.getResponses();
		Movie movie = new Movie();
		List<Movie> movies = movie.readMoviesFromCSV("/Users/" + System.getProperty("user.name") + "/git/BlueBubble/BlueBubble/src/BlueBubble/movies.txt");
		ArrayList<Movie> selectedMovies = new ArrayList<Movie>();
		for(Movie selected : movies) {
			if(selected.getGenre().contains(responses.get(0)) || selected.getDirector().contains(responses.get(1)) || selected.getActor().contains(responses.get(2))) {
				selectedMovies.add(selected);
			}
		}
		for(Movie selected : selectedMovies) {
			System.out.println(selected + "\n");
		}
	}
	
	public static void displayBBLogo() {
		String logo = "     /\\     /\\\n"
                + "    /  \\___/  \\\n"
                + "   /           \\\n"
                + "  /    Blue     \\\n"
                + " /    Bubble    \\\n"
                + "/_______________\\\n"
                + "\\               /\n"
                + " \\             /\n"
                + "  \\           /\n"
                + "   \\_________/\n";
    
		System.out.println(logo);
		System.out.println("WELCOME, to BlueBubble!"); 
	}
}

