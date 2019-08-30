package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester
{
	public static void main(String[] args)
	{
		DateAndPlaceOfBirth ad1 = new DateAndPlaceOfBirth(2001, 1, 13, "Victor", "NY", "USA");
		StreetUSAddress street1 = new StreetUSAddress("123 Main Street", "", "Binghamton", "NY", "13901"); 
		Person guy = new Person("Andrew", "Horihan", "123-456-7890", ad1, street1);
		
		ComputerOwner owner = new ComputerOwner(guy);
		
		Computer mac = new Computer("Mac", "Core i7", 8, 500, true, 750);
		Computer dell = new Computer("Dell", "Core i5", 8, 750, false, 500);
		Computer asus = new Computer("Asus", "Core i9", 12, 1200, true, 1150);
		Computer hp = new Computer("HP", "Core i9", 10, 1100, false, 999);
		
		owner.addComputer(mac);
		owner.addComputer(dell);
		owner.addComputer(asus);
		owner.addComputer(hp);
		
		System.out.println(owner);
		
		owner.removeComputer(0);
		owner.removeComputer(1);
		
		System.out.println(owner);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		DateAndPlaceOfBirth ad12 = new DateAndPlaceOfBirth(2001, 1, 13, "Victor", "NY", "USA");
		StreetUSAddress street12 = new StreetUSAddress("123 Main Street", "", "Binghamton", "NY", "13901"); 
		Person guy2 = new Person("Andrew", "Horihan", "123-456-7890", ad12, street12);
		
		ComputerOwner owner2 = new ComputerOwner(guy);
		
		Computer mac2 = new Computer("Mac", "Core i7", 8, 500, true, 750);
		Computer dell2 = new Computer("Dell", "Core i5", 8, 750, false, 500);
		Computer asus2 = new Computer("Asus", "Core i9", 12, 1200, true, 1150);
		Computer hp2 = new Computer("HP", "Core i9", 10, 1100, false, 999);
		
		owner2.addComputer(mac);
		owner2.addComputer(dell);
		owner2.addComputer(asus);
		owner2.addComputer(hp);
		
		output.println(owner2);
		
		owner2.removeComputer(0);
		owner2.removeComputer(1);
		
		output.println(owner2);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}