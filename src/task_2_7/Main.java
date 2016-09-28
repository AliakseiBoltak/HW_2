package t27;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList <Book> () ;
		
		list.add(new Book("java", "eckel", 300, 6));
		list.add(new Book("java", "shildt", 200, 1));
		list.add(new Book("java", "horstmann", 300, 2));
		list.add(new Book("onegin", "pushkin", 200, 100));
		list.add(new Book("voina_i_mir", "tolstoi", 200, 200));
		
		Collections.sort(list);
		
		for(Book book :list){
			System.out.println(book);
		}
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE-Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE+100);
		
		System.out.println(Double.MAX_VALUE+10000);
	}
}
