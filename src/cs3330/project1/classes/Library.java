package cs3330.project1.classes;

public class Library {
	private Book[] books = new Book[5];
	private int count = 0;
	
	public boolean addBook(Book book) {
		if (count < 5) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
	}
	
	public boolean removeBook(Book book) {
		for (int i = 0; i < 5; i++) {
			if (books[i] == book) {
				Book[] temp = new Book[5];
				for (int j = 0; j < i; j++) {
					temp[j] = books[j];
				}
				for (int j = i; j < books.length - 1; j++) {
					temp[j] = books[j+1];
				}
				for (int k = 0; k < temp.length; k++) {
					books[k] = temp[k];
				}
				count--;
				return true;
			}
		}
		return false;
	} 
	
	public Book searchByISBN(String ISBN) {
		for (int i = 0; i < 5; i++) {
			String x = books[i].getISBN().replaceAll("\\P{Print}","");
			if (x.equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}
	
	public void displayBooks() {
		int i = 0;
		while (books[i] != null) {
			System.out.println(books[i].toString());
			i++;
		}
	}
}
