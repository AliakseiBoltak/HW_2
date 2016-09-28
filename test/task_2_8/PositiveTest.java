package t28;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PositiveTest {

	ArrayList<Book> list = new ArrayList<Book>();

	@BeforeTest
	public void TitlePositiveTest() {
		list.add(new Book("java", "eckel", 300, 6));
		list.add(new Book("c++", "shildt", 200, 1));
		list.add(new Book("c#", "horstmann", 300, 2));
	}
	
	@Test
	public void comparable() {
		Collections.sort(list, ComparatorBook.getTitleComparator());
		for (int i = 0; i < list.size() - 1; i++) {
			Assert.assertTrue((list.get(i).getTitle().compareTo(list.get(i + 1).getTitle()) < 0));
		}
	}
}
