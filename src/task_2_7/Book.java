package t27;

import java.util.Objects;



public class Book implements Comparable <Book>{
	private String title;
	private String author;
	private int price;
	private static int edition;
	private double isdn;

    public Book(String title, String author, int price ,  double isdn){
    	this.setTitle(title);
    	this.setAuthor(author);
    	this.setPrice(price);
    	this.setIsdn(isdn);
    }
    
    public Book(String title, String author, int price ,  double isdn , int edition){
    	this.setTitle(title);
    	this.setAuthor(author);
    	this.setPrice(price);
    	this.setIsdn(isdn);
        Book.setEdition(edition);    	
    }
    
	@Override
	public int compareTo(Book anotherBook) {
		double anotherBookISDN=anotherBook.getIsdn();
		return (int) (this.getIsdn()-anotherBookISDN);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Book temp = (Book) obj;
		return price == temp.price && isdn==temp.isdn && (title == temp.title || (title != null && title.equals(temp.getTitle())))
				&& (author == temp.author || (author != null && author.equals(temp.getAuthor())));
	}

	 @Override public int hashCode() {
	     return Objects.hash(title, author, price, isdn);
	 }

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", isdn=" + isdn + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getEdition() {
		return edition;
	}

	public static void setEdition(int edition) {
		Book.edition = edition;
	}

	public double getIsdn() {
		return isdn;
	}


	public void setIsdn(double isdn) {
		this.isdn = isdn;
	}

}
