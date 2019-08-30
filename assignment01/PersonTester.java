package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester
{
	public static void main(String[] args)
	{
		DateAndPlaceOfBirth ad1 = new DateAndPlaceOfBirth(2001, 1, 13, "Victor", "NY", "USA");
		StreetUSAddress street1 = new StreetUSAddress("123 Main Street", "", "Binghamton", "NY", "13901"); 
		Person guy = new Person("Andrew", "Horihan", "123-456-7890", ad1, street1);
		
		System.out.println(guy);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		DateAndPlaceOfBirth ad12 = new DateAndPlaceOfBirth(2001, 1, 13, "Victor", "NY", "USA");
		StreetUSAddress street12 = new StreetUSAddress("123 Main Street", "", "Binghamton", "NY", "13901"); 
		Person guy2 = new Person("Andrew", "Horihan", "123-456-7890", ad1, street1);
		
		output.println(guy2);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}