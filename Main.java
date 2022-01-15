

public class Main {
	public static void main(String[] args) throws InterruptedException {
		BookList bookObserver = new BookList();

		BookObserver book = new BookObserver();

		book.addObserver(bookObserver);

		book.showBooks();
	}
}
