package t27;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	
	@Test
	public void NegativeTest() {

		ArrayList<Book> list = new ArrayList <Book> () ;
		list.add(new Book("java", "eckel", 2, Integer.MAX_VALUE));
		list.add(new Book("java", "shildt", 2, Integer.MIN_VALUE));
		list.add(new Book("java", "horstmann", 5, 1));
		list.add(new Book("java", "horstmann", 5, -10));
		list.add(new Book("java", "horstmann", 5, -101));
		list.add(new Book("java", "horstmann", 5, 100));
		list.add(new Book("java", "horstmann", 5, 0));
		Collections.sort(list);
		
		for (int i = 0; i < list.size() - 1; i++) {
			Assert.assertTrue(list.get(i).getIsdn() <= list.get(i + 1).getIsdn());
		}
	}
}
