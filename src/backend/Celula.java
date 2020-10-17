package backend;

import java.util.Random;
import java.util.concurrent.locks.Lock;

public abstract class Celula {
	private int timeFull = 0;
	private int timeStarve = 0;
	private int numberOfMeals = 0;
	private Food food = null;
	private Lock lock = null;
	private Random rand;
	
	public Celula(Food f, Lock l) {
		this.food = f;
		this.lock = l;
		this.rand = new Random();
	}
	
	public abstract void reproduce();
	
	public void eat() {
		lock.lock();
		food.setFoodUnits(food.getFoodUnits() - 1);
		lock.unlock();
		numberOfMeals++;
	}
	
	public int getFullTime() {
		return this.timeFull;
	}
	
	public int getStarvationTime() {
		return this.timeStarve;
	}
	
	public void die() {
		int randNumberOfFood = rand.nextInt(5);
		lock.lock();
		food.setFoodUnits(food.getFoodUnits() + randNumberOfFood);
		lock.unlock();
	}
}
