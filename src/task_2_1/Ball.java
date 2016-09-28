package T9;

import java.util.ArrayList;

public class Ball {
	private final double BALL_MAX_WEIGHT = 100;
	private String color;
	private double weight;
	private static ArrayList<Ball> listOfBalls = new ArrayList<Ball>();

	public Ball(String color, double weight) {
		if (weight <= BALL_MAX_WEIGHT && weight>0) {
			this.setColor(color);
			this.setWeight(weight);
			listOfBalls.add(this);
		} else {
			this.setColor(color);
			this.setWeight(BALL_MAX_WEIGHT);
			listOfBalls.add(this);
		}
	}
	
	public static double getWeightOfBalls(){
		double totalWeight = 0;
		for (int i = 0; i < Ball.getListOfBalls().size(); i++) {
			totalWeight += Ball.getListOfBalls().get(i).getWeight();
		}
		return totalWeight;
	}
	
	@Override
	public String toString() {
		return "[BALL_MAX_WEIGHT=" + BALL_MAX_WEIGHT + ", color=" + color + ", weight=" + weight + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static ArrayList<Ball> getListOfBalls() {
		return listOfBalls;
	}

	public void setListOfBalls(ArrayList<Ball> listOfBalls) {
		this.listOfBalls = listOfBalls;
	}
}
