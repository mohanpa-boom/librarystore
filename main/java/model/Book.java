package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Book {
	
	/* Here we can added common basic  details in library stroe*/
	
	@Id
	String bookId;
	String bookName;
	String author;
	String publisher;
	
	/* Here, we can use many to one method*/
	
	@ManyToOne
	private Library library;
	
	public Book() {
		super();
	}
	
/* Here, we can implement getters & setter method and then override method can be implemented*/
	
	public Book(String bookId, String bookName, String author, String publisher, Library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.library = library;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher
				+ ", library=" + library + "]";
	}
	
	
	

}
