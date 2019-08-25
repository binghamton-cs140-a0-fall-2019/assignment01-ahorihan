package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	Computer mac = new Computer("Mac", "Core i7", 8, 500, true, 750);
	Computer dell = new Computer("Dell", "Core i5", 8, 750, false, 500);
	Computer asus = new Computer("Asus", "Core i9", 12, 1200, true, 1150);
	Computer hp = new Computer("HP", "Core i9", 10, 1100, false, 999);
	
	System.out.println(mac);
	System.out.println(dell);
	System.out.println(asus);
	System.out.println(hp);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
	Computer mac2 = new Computer("Mac", "Core i7", 8, 500, true, 750);
	Computer dell2 = new Computer("Dell", "Core i5", 8, 750, false, 500);
	Computer asus2 = new Computer("Asus", "Core i9", 12, 1200, true, 1150);
	Computer hp2 = new Computer("HP", "Core i9", 10, 1100, false, 999);
	
	output.println(mac2);
	output.println(dell2);
	output.println(asus2);
	output.println(hp2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}