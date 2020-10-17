package backend;

public class Food {
	
	private int foodUnits = 0; // variable accessed by multiple threads, needs to be protected
	
	public Food(int foodUnits) {
		this.setFoodUnits(foodUnits);
	}

	public int getFoodUnits() {
		return foodUnits;
	}

	public void setFoodUnits(int foodUnits) {
		this.foodUnits = foodUnits;
	}
	

}
