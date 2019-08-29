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
	}
}