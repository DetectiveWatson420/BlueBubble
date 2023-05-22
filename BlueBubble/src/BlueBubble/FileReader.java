package BlueBubble;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class FileReader {
	 public static void main(String[] args) {
		    try {
		    //FILE WILL NOT WORK UNLESS THE CSV IS IN YOUR DOCUMENTS FOLDER
		    //this code may also need to be edited, currently might only work on macos
		      File myObj = new File("/Users/209580/Documents/movies.csv");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
}
