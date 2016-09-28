package t28;

import java.util.Comparator;

public class ComparatorBook {

    private static  Comparator <Book>  TitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    private static  Comparator<Book> TitleAuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getTitle().compareTo(o2.getTitle());
            if(result != 0) return result;
            result = o1.getAuthor().compareTo(o2.getAuthor());
            return result != 0 ? result : 0;
        }
    };

    private static  Comparator<Book> AuthorTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getAuthor().compareTo(o2.getAuthor());
            if(result != 0) return result;
            result = o1.getTitle().compareTo(o2.getTitle());
            return result != 0 ? result : 0;
        }
    };

    private static Comparator<Book> AuthorTitlePriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getAuthor().compareTo(o2.getAuthor());
            if(result != 0) return result;
            result = o1.getTitle().compareTo(o2.getTitle());
            if(result != 0) return result;
            result = o1.getPrice() - o2.getPrice();
            return result != 0 ? result : 0;
        }
    };

	public static Comparator<Book> getTitleComparator() {
		return TitleComparator;
	}

	public static void setTitleComparator(Comparator<Book> titleComparator) {
		TitleComparator = titleComparator;
	}

	public static Comparator<Book> getTitleAuthorComparator() {
		return TitleAuthorComparator;
	}

	public static void setTitleAuthorComparator(Comparator<Book> titleAuthorComparator) {
		TitleAuthorComparator = titleAuthorComparator;
	}

	public static Comparator<Book> getAuthorTitleComparator() {
		return AuthorTitleComparator;
	}

	public static void setAuthorTitleComparator(Comparator<Book> authorTitleComparator) {
		AuthorTitleComparator = authorTitleComparator;
	}

	public static Comparator<Book> getAuthorTitlePriceComparator() {
		return AuthorTitlePriceComparator;
	}

	public static void setAuthorTitlePriceComparator(Comparator<Book> authorTitlePriceComparator) {
		AuthorTitlePriceComparator = authorTitlePriceComparator;
	}

   
}