package t27;

import java.util.ArrayList;
import java.util.Collections;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {

	@Test
	public void PositiveTest() {

		ArrayList<Book> list = new ArrayList <Book> () ;
		list.add(new Book("java", "eckel", 300, 6));
		list.add(new Book("java", "shildt", 200, 1));
		list.add(new Book("java", "horstmann", 300, 2));
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size() - 1; i++) {
			Assert.assertTrue(list.get(i).getIsdn() <= list.get(i + 1).getIsdn());
		}
	}
}
