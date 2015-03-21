
public class Cycle {
	/**
	 * initializing variables for constructor class Cycle, and making the variables
	 * private so they cannot be called in other classes normally
	 */
private int NumberOfWheels, weight;

public Cycle(){
	this(100,1000);
	
	/**
	 * this method will give default values to the numberofwheels and weight
	 */
}

public Cycle(int NumberOfWheels, int weight){
	this.NumberOfWheels = NumberOfWheels;
	this.weight= weight;
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

