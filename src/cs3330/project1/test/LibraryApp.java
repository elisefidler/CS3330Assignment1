package cs3330.project1.test;

import cs3330.project1.classes.Book;
import cs3330.project1.classes.Library;

public class LibraryApp {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "‎9780743273565", 6.50);
		Book book2 = new Book("Pride and Prejudice", "Jane Austen", "‎9780141439518", 5.95);
		Book book3 = new Book("Moby-Dick", "Herman Melville", "1503280780", 7.00);
		
		myLibrary.addBook(book1);
		myLibrary.addBook(book2);
		myLibrary.addBook(book3);
		
		System.out.println("Book with ISBN 1503280780: " + myLibrary.searchByISBN("1503280780"));


	}

}
