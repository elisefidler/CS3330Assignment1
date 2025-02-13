package cs3330.assignment1.classes;

/**
 * Represents a book with a title, author, ISBN, and price. 
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * Default constructor for Book class. 
	 * 
	 * Initializes variables to default values if no user input is provided. 
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * Parameterized constructor for Book class.
	 * 
	 * Initializes variables using user input.
	 * 
	 * @param title - The title of the book
	 * @param author - The author of the book
	 * @param ISBN - The book's ISBN
	 * @param price - The book's price
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public double getPrice() {
		return price;
	}
	
	/**
	 * Custom copy constructor for Book class.
	 * 
	 * Creates a new Book object from user provided Book. Book objects share values.
	 * 
	 * @param aBook - Book object that user wants copied into new object
	 */
	public Book(Book aBook) {
		title = aBook.title;
		author = aBook.author;
		ISBN = aBook.ISBN;
		price = aBook.price;
	}
	
	/**
	 * Returns Book object's title, author, ISBN, and price as a string.
	 */
	@Override 
	public String toString() {
		return ("Title: " + title + " " + "Author: " + author + " " + "ISBN: " + ISBN + " " + "Price: " + price);
	}
	
	/**
	 * Compares two Book objects to one another. 
	 * 
	 *  If the objects' ISBNs are the same, they are considered equal and true 
	 *  is returned. Otherwise, false is returned.
	 *  
	 *  @param other - Book object user wants to compare
	 */
	@Override
	public boolean equals(Object other) {
		Book x = (Book) other;
		return ISBN.equals(x.ISBN);
	}
}
