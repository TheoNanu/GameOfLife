package backend;

public class Food {
	
	private int foodUnits; // variable accessed by multiple threads, needs to be protected
	
	public Food(int fUnits) {
		this.foodUnits = fUnits;
	}

	public synchronized int getFoodUnits() {
		return this.foodUnits;
	}

	public synchronized void setFoodUnits(int fUnits) {
		this.foodUnits = fUnits;
	}
	
	public synchronized boolean hasUnits()
	{
		if(this.foodUnits > 0)
			return true;
		else
			return false;
	}
	
	public synchronized void decrementUnits()
	{
		this.foodUnits--;
	}
}
