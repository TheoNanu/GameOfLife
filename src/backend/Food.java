package backend;

public class Food {
	
	private int foodUnits = 0; // variable accessed by multiple threads, needs to be protected
	
	public Food(int foodUnits) {
		this.setFoodUnits(foodUnits);
	}

	public synchronized int getFoodUnits() {
		return foodUnits;
	}

	public synchronized void setFoodUnits(int foodUnits) {
		this.foodUnits = foodUnits;
	}
	

}
