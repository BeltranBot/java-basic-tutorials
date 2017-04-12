import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	public static void main(String[] args) {
		
		Test test = new Test();
		
		
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
			
		}
		*/
		
		// Try multi-catch
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// since FileNoutFoundException extends from
		// IOException, this has to be put first or 
		// else the compiler would generate an 
		// unrechable statement error
		
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
