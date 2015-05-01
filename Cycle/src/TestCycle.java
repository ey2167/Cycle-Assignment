import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * Elohe Yonas
 * CSC201 
 * Cycle Assignment
 *
 */
public class TestCycle {
	/**
	 * this is the driver class that tests the constructor classes
	 * @throws FileNotFoundException 
	 * 
	 */
	public static void main(String[]args) throws FileNotFoundException{
		
		
		Cycle car = new Cycle();
		String filename = "Cycle.txt";
		Scanner inputfile = new Scanner(new File(filename));
		String[] line = new String[2];
		int i = 0;
		while(inputfile.hasNext()){
			line[i] = inputfile.nextLine();
			i++;
		}
		for (String n:line){
			System.out.println(n);
		}
		System.out.println("the number of wheels is" + line[0]);
		System.out.println("the weight is" + line[1]);
inputfile.close();



/**
 * car2 will invoke the default variables within the cycle class due to it relying on the default constructor
 */

/**
 * the string from Constructor Class Cycle will be carried out in this line
 */

}
}