package cs3330.assignment1.classes;

/**
 * Represents a library containing books.
 * 
 * May contain up to 5 Book objects in books array. 
 * Variable count keeps track of number of books currently contained in it.
 */

public class Library {
	private Book[] books = new Book[5];
	private int count = 0;
	
	/**
	 * Adds a book to library and updates book count.
	 * 
	 * If library is full, no books are added.
	 * 
	 * @param book - Book object to be added
	 * @return - True if book is added to library, false otherwise. 
	 */
	
	public boolean addBook(Book book) {
		if (book == null) {
			return false;
		}
		if (count < 5) {
			books[count] = book;
			count++;
			return true;
		}
		return false;
	}
	
	/**
	 * Removes a book from the library if it exists and updates book count.
	 * 
	 * @param book - Book object to be removed.
	 * @return - True if book exists in library and is removed, false otherwise.
	 */
	public boolean removeBook(Book book) {
		if (book == null) {
			return false;
		}
		for (int i = 0; i < count; i++) {
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
	
	/**
	 * Searches for book in library that has provided ISBN.
	 * 
	 * @param ISBN - ISBN of book being searched for
	 * @return Book that matches ISBN if it exists in library, null otherwise
	 */
	public Book searchByISBN(String ISBN) {
		for (int i = 0; i < count; i++) {
			String isbn = books[i].getISBN().replaceAll("\\P{Print}",""); //removes non-printable Unicode characters
			if (isbn.equals(ISBN)) {
				return books[i];
			}
		}
		return null;
	}
	
	/**
	 * Prints all books in library.
	 */
	public void displayBooks() {
		int i = 0;
		while (books[i] != null) {
			System.out.println(books[i].toString());
			i++;
		}
	}
}
