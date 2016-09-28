package t28;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	
	ArrayList<Book> list = new ArrayList<Book>();
	boolean increasing;
	
  @Test
  public void TitleNegativeTest() {
	  
	    list.add(new Book("", "eckel", 300, 6));
		list.add(new Book("", "shildt", 200, 1));
		list.add(new Book("", "horstmann", 300, 2));
        increasing=true;
		 for(int i = 0; i < list.size()-1; i++) {
           if(list.get(i).getTitle().compareTo(list.get(i+1).getTitle()) > 0) {
               increasing=false;
           }
       }
   }
	  
  @Test
  public void comparable() {
      Collections.sort(list, ComparatorBook.getTitleComparator());
      Assert.assertTrue(increasing);
  }
	  
	  

  
  
  
  
}
