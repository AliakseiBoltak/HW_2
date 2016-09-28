package T9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	
	  @Test
	  public void NegativeTest() {
		  Ball ball = new Ball ("blue", Double.MAX_VALUE);
		  Ball ball2= new Ball ("red", Double.POSITIVE_INFINITY);
		  Ball ball3= new Ball ("red", Double.NEGATIVE_INFINITY);
		  Basket basket= new Basket (10);
		  basket.fillBasket(ball.getListOfBalls());
		  Assert.assertEquals(300.0, basket.getWeightOfBallsInBasket());
	  }
}
