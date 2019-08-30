package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester
{
	public static void main(String[] args)
	{
		SimpleDate date1 = SimpleDate.of(2019, 7, 13);
		SimpleDate date2 = SimpleDate.of(2019, 7, 14);
		System.out.println(date1.before(date2));
		
		SimpleDate date3 = SimpleDate.of(2015, 5, 7);
		SimpleDate date4 = SimpleDate.of(2013, 5, 7);
		System.out.println(date3.before(date4));
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDateTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		SimpleDate date12 = SimpleDate.of(2019, 7, 13);
		SimpleDate date22 = SimpleDate.of(2019, 7, 14);
		output.println(date12.before(date22));
		
		SimpleDate date32 = SimpleDate.of(2015, 5, 7);
		SimpleDate date42 = SimpleDate.of(2013, 5, 7);
		output.println(date32.before(date42));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
