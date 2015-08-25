package ir.backend.models;

import com.j256.ormlite.field.DatabaseField;

public class Entry {
	

	// Column attributes for DB
	
	public static final String ID_COLUMN = "id";
	public static final String CONTENT_COLUMN = "name";
	public static final String AUTHOR_COLUMN = "author_id";
	public static final String BOOK_COLUMN = "book_id";
	
	// Instance variables
	
	@DatabaseField(columnName = ID_COLUMN, generatedId = true)
	private int id;
	
	@DatabaseField(columnName = CONTENT_COLUMN)
	private String content;
	
	@DatabaseField(columnName = AUTHOR_COLUMN, foreign = true)
	private Author author;
	
	@DatabaseField(columnName = BOOK_COLUMN, foreign = true)
	private Book book;
	
	// Constructors
	
	public Entry() {
		
	}
	
	public Entry(String content, Author author, Book book) {
		this.content = content;
		this.author = author;
		this.book = book;
	}

	
	// Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
