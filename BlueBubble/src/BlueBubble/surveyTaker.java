package BlueBubble;
import java.util.ArrayList;
import java.util.Scanner;
public class surveyTaker {
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<String> responses = new  ArrayList<String>(1);
	
	public surveyTaker(String... questions) {
		setQuestions(questions);
		askQuestions();
	}
	
	private void askQuestions() {
		Scanner myScanner = new Scanner(System.in).useDelimiter("\n");
		System.out.println("\nLet's begin our survey!");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter your name!");
		String userName = myScanner.next();
		System.out.println("Welcome, " + userName);
		for(String question : questions) {
			System.out.println("So, " + userName + " " + question);
			String response = myScanner.next();
			responses.add(response);
			myScanner.nextLine();
		}
	}
	
	public ArrayList<String> getResponses() {
		return responses;
	}
	
	private void setQuestions(String... questions) {
		for(String question: questions) {
			this.questions.add(question);
		}
	};
	
}
