package T9;

import java.util.ArrayList;

public class Basket {
	
	private double capacity;
	private ArrayList <Ball> balls= new ArrayList <Ball> ();
	
	public Basket(int capacity){
		this.setCapacity(capacity);
	}
	
	public void fillBasket(ArrayList <Ball> balls){
		if(balls.size()<=capacity){
			this.setBalls(balls);
		}else{
			System.out.println("Недостаточно места в корзине");
		}
	}
	
	public  double getWeightOfBallsInBasket(){
		double totalWeight = 0;
		for (int i = 0; i < this.getBalls().size(); i++) {
			totalWeight += this.getBalls().get(i).getWeight();
		}
		return totalWeight;
	}
	
	public  int getNumberOfColors (String color){
		int counter=0;
		for (Ball ball : balls){
			if(ball.getColor().equals(color)){
				counter++;
			}
		}
		return counter;
	}
	
	
	public ArrayList<Ball> getBalls() {
		return balls;
	}

	public void setBalls(ArrayList<Ball> balls) {
		this.balls = balls;
	}

	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
