package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester
{
	public static void main(String[] args)
	{
		DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth(2001, 1, 13, "Rochester", "New York", "USA");
		DateAndPlaceOfBirth person2 = new DateAndPlaceOfBirth(1997, 6, 18, "Los Angeles", "California", "USA");
		DateAndPlaceOfBirth person3 = new DateAndPlaceOfBirth(2003, 6, 18, "Albany", "New York", "USA");
		DateAndPlaceOfBirth person4 = new DateAndPlaceOfBirth(1997, 6, 18, "Paris", "France");
		DateAndPlaceOfBirth person5 = new DateAndPlaceOfBirth(2001, 10, 25, "Toronto", "Canada");
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		
		System.out.println(person1.olderThan(person2)); //false
		System.out.println(person2.olderThan(person1)); //true
		
		System.out.println(person2.youngerThan(person3)); //false
		System.out.println(person3.youngerThan(person2)); //true
		
		System.out.println(person2.hasSameBirthDateAs(person4)); //true
		System.out.println(person3.hasSameBirthDateAs(person4)); //false
		
		System.out.println(person2.hasSameBirthDayAs(person3)); //true
		System.out.println(person3.hasSameBirthDayAs(person5)); //false
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		DateAndPlaceOfBirth person12 = new DateAndPlaceOfBirth(2001, 1, 13, "Rochester", "New York", "USA");
		DateAndPlaceOfBirth person22 = new DateAndPlaceOfBirth(1997, 6, 18, "Los Angeles", "California", "USA");
		DateAndPlaceOfBirth person32 = new DateAndPlaceOfBirth(2003, 6, 18, "Albany", "New York", "USA");
		DateAndPlaceOfBirth person42 = new DateAndPlaceOfBirth(1997, 6, 18, "Paris", "France");
		DateAndPlaceOfBirth person52 = new DateAndPlaceOfBirth(2001, 10, 25, "Toronto", "Canada");
		
		output.println(person12);
		output.println(person22);
		output.println(person32);
		output.println(person42);
		output.println(person52);
		
		output.println(person12.olderThan(person22)); //false
		output.println(person22.olderThan(person12)); //true
		
		output.println(person22.youngerThan(person32)); //false
		output.println(person32.youngerThan(person22)); //true
		
		output.println(person22.hasSameBirthDateAs(person42)); //true
		output.println(person32.hasSameBirthDateAs(person42)); //false
		
		output.println(person22.hasSameBirthDayAs(person32)); //true
		output.println(person32.hasSameBirthDayAs(person52)); //false
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}