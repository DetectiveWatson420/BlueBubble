package BlueBubble;
import java.util.ArrayList;
import java.util.Scanner;
public class surveyTaker {
	private ArrayList<String> questions = new ArrayList<String>();
	private ArrayList<ArrayList<String>> responses = new  ArrayList<ArrayList<String>>();
	
	public surveyTaker(ArrayList<String> questions) {
		askQuestions();
	}
	
	private void askQuestions() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\nLet's begin our survey!");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter your name!");
		String userName = myScanner.next();
		System.out.println("Welcome, " + userName);
		String more = "y";
		int questionIndex = 0;
		for(String question : questions) {
			while(more.contains("y")) {
				System.out.println("So, " + userName + " " + question);
				responses.get(questionIndex).add(myScanner.next());
				System.out.println("Any other?");
				more = myScanner.next();
			}
			questionIndex++;
		}
	}
	
}
