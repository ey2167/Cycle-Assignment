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
	 * 
	 */
	public static void main(String[]args){

		
		/**
		 * car will act as the object of Cycle.
		 *
		/**
		 * the parameters decide the numberofwheels and weight of the car
		 */
		Cycle car = new Cycle(4,200);
System.out.println(car.toString());
/**
 * the string from Constructor Class Cycle will be carried out in this line
 */

Cycle car2 = new Cycle();
/**
 * car2 will invoke the default variables within the cycle class due to it relying on the default constructor
 */
System.out.println(car2.toString());
/**
 * the string from Constructor Class Cycle will be carried out in this line
 */

}
}