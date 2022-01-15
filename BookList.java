
public class BookList implements Observer {

	private String lastBook;

	public BookList() {
	}

	public void update(Object arg) {
		String currentBook = (String) arg;

		if ("Computer Science" == currentBook) {
			System.out.println("Book Title: Computer Science ");
			System.out.println("Book Auhtor : Tom Holland");
			System.out.println("Book Price : $45 ");
		} else if ("Intro to Software Engineering" == currentBook) {
			System.out.println("Book Title: Intro Software Engineering ");
			System.out.println("Book Auhtor : Andrew Garfield");
			System.out.println("Book Price : $45 ");
		} else if ("HCI" == currentBook) {
			System.out.println("Book Title: HCI ");
			System.out.println("Book Auhtor : Toby Maguire");
			System.out.println("Book Price : $75 ");
		} else {
			System.out.println("No Book Exists!!!");

		}
		lastBook = currentBook;
	}

	public void addObserver(BookObserver book) {
		// TODO Auto-generated method stub
		
	}
}
