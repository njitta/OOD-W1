import java.util.ArrayList;
import java.util.List;

public class BookObserver implements Subject {

	private int bookNumber = 0;
	private String currentBook;

	private String[] books = { "Computer Science","Intro to Software Engineering","HCI" };
	int length = books.length;

	private List<Observer> observrs = new ArrayList<>();

	public BookObserver() {
		currentBook = books[0];
	}

	public void showBooks() throws InterruptedException {
		for (int i = 0; i < length; i++) {
	
			currentBook = books[bookNumber];
	
			bookNumber = (bookNumber) + 1;
			System.out.println();
			updateObserver(currentBook);
			
		}
	}

	public void addObserver(Observer observer) {
		observrs.add(observer);
	}

	public void removeObserver(Observer observr) {
		observrs.remove(observr);
	}

	public void updateObserver(Object arg) {
		for (Observer observr : observrs) {
			observr.update(arg);
		}
	}

}
