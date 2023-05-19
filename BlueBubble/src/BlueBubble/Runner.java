package BlueBubble;

public class Runner {
	public static void main(String[] args) {
		displayBBLogo();
		surveyTaker mySurvey = new surveyTaker(null);
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

