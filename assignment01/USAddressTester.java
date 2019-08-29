package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester
{
	public static void main(String[] args)
	{
		StreetUSAddress home1 = new StreetUSAddress("1234 Main Street", "300 Elm Street", "Albany", "NY", "12201");
		StreetUSAddress home2 = new StreetUSAddress("6694 Setters Run", "", "Victor", "NY", "14564");
		
		System.out.println(home1);
		System.out.println(home2);
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		StreetUSAddress home12 = new StreetUSAddress("1234 Main Street", "300 Elm Street", "Albany", "NY", "12201");
		StreetUSAddress home22 = new StreetUSAddress("6694 Setters Run", "", "Victor", "NY", "14564");
		
		output.println(home12);
		output.println(home22);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}