package t28;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		
		Comparator<Book> comparator = ComparatorBook.getTitleComparator();
		Set<Book> set = new TreeSet<Book>(comparator);
		
		set.add(new Book("java", "eckel", 10 ));
		set.add(new Book("c++", "shildt", 30));
		set.add(new Book("c#", "a", 40, 1));
		
		for(Book book : set) {
			System.out.println(book.toString());
		}
		
		System.out.println("///////////////////");
		
		Comparator<Book> comparator2 = ComparatorBook. getTitleAuthorComparator();
		Set<Book> set2 = new TreeSet<Book>(comparator2);
		
		set2.add(new Book("java", "eckel", 10 ));
		set2.add(new Book("java", "shildt", 20));
		set2.add(new Book("c#", "a", 40));
		
		for(Book book2 : set2) {
			System.out.println(book2.toString());
		}
		
		System.out.println("///////////////////");
		
		Comparator<Book> comparator3= ComparatorBook.getAuthorTitleComparator();
		Set<Book> set3 = new TreeSet<Book>(comparator3);
		set3.add(new Book("java", "eckel", 10 ));
		set3.add(new Book("java", "shildt", 20));
		set3.add(new Book("c#", "a", 40));
		
		for(Book book3 : set3) {
			System.out.println(book3.toString());
		}
		
		System.out.println("///////////////////");
		
		Comparator<Book> comparator4= ComparatorBook.getAuthorTitlePriceComparator() ;
		Set<Book> set4 = new TreeSet<Book>(comparator4);
		set4.add(new Book("java", "eckel", 10 ));
		set4.add(new Book("java", "shildt", 20));
		set4.add(new Book("c#", "a", 40));
		
		for(Book book4 : set4) {
			System.out.println(book4.toString());
		}
		
	}
}
