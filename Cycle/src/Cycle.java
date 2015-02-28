
public class Cycle {
	/**
	 * initializing variables for constructor class Cycle, and making the variables
	 * private so they cannot be called in other classes normally
	 */
private int NumberOfWheels = 100, weight = 1000;

public Cycle(int NumberOfWheels1, int weight1){
	this.NumberOfWheels = NumberOfWheels1;
	this.weight = weight1;
}
	public String toString(){
		return " i have " + NumberOfWheels + " wheels and they are " + weight + " pounds each";
	}
}

