package cs3330.project1.classes;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
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
	
	public Book(Book aBook) {
		title = aBook.title;
		author = aBook.author;
		ISBN = aBook.ISBN;
		price = aBook.price;
	}
	
	@Override 
	public String toString() {
		return ("Title: " + title + " " + "Author: " + author + " " + "ISBN: " + ISBN + " " + "Price: " + price);
	}
	
	@Override
	public boolean equals(Object other) {
		Book x = (Book) other;
		return ISBN.equals(x.ISBN);
	}
}
