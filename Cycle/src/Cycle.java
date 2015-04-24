import java.io.IOException;
import java.util.Scanner;


public class Cycle {
	double NumberOfWheels;
	/**
	 * initializing variables for constructor class Cycle, and making the variables
	 * private so they cannot be called in other classes normally
	 */
private double weight;
Scanner keyboard = new Scanner(System.in);
public Cycle(){
	this(100.0,1000.0);
	
	/**
	 * this method will give default values to the numberofwheels and weight
	 */
}

public Cycle(double NumberOfWheels, double weight){
	try{
	System.out.println("type number of wheels here");
	NumberOfWheels= keyboard.nextDouble();
	System.out.println("type weight here");
	weight = keyboard.nextDouble();
	this.NumberOfWheels = NumberOfWheels;
	this.weight= weight;
	}
	catch(Exception e){
		System.out.println("invalid input, closing");
		System.exit(0);
	}
	if(weight<0 || NumberOfWheels<0){
		throw new IllegalArgumentException("no negative weight, closing");
		
			
		
	}
	/**
	 * the this values here will set the private variables equal to the parameters of the constructor
	 */
}


	public String toString(){
		return " i have " + NumberOfWheels + " wheels and they are " + weight + " pounds each";
	}
	/**
	 * the toString here will showcase the results of the constructor 
	 */
}

