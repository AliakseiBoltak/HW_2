package T9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {
	
  @Test
  public void PositiveTest() {
	  
	  Ball ball = new Ball ("blue", 12.0);
	  Ball ball2= new Ball ("red", 8.0);
	  Basket basket= new Basket (10);
	  basket.fillBasket(ball.getListOfBalls());
	  Assert.assertEquals(20.0, basket.getWeightOfBallsInBasket(), 0.0001 );
	  Assert.assertEquals(1, basket.getNumberOfColors("blue"));
  }
  
  
  
}
