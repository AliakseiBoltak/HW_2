package t28;


import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int price;
	private static int edition;

    public Book(String title, String author, int price){
    	this.setTitle(title);
    	this.setAuthor(author);
    	this.setPrice(price);
    }
    
    public Book(String title, String author, int price, int edition){
    	this.setTitle(title);
    	this.setAuthor(author);
    	this.setPrice(price);
    	setEdition(edition);
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
		return price == temp.price && (title == temp.title || (title != null && title.equals(temp.getTitle())))
				&& (author == temp.author || (author != null && author.equals(temp.getAuthor())));
	}

	 @Override public int hashCode() {
	     return Objects.hash(title, author, price);
	 }
	 
	
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", price=" + price+", edition="+edition;
	}

	public String getTitle() {
		return title;
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

}
