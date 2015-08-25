package ir.backend.models;

import java.sql.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "books")
public class Book {

	
	// Column attributes for DB
	
	public static final String ID_COLUMN = "id";
	public static final String NAME_COLUMN = "name";
	public static final String DATE_COLUMN = "publish_date";
	public static final String AUTHOR_COLUMN = "author_id";

	
	// Instance variables
	
	@DatabaseField(columnName = ID_COLUMN, generatedId = true)
	private int id;
	
	@DatabaseField(columnName = NAME_COLUMN, canBeNull = false)
	private String name;
	
	@DatabaseField(columnName = DATE_COLUMN, dataType = DataType.DATE_STRING)
	private Date publishDate;
	
	@DatabaseField(columnName = AUTHOR_COLUMN, foreign = true)
	private Author author;
	
	
	// Constructors	
	
	public Book() {
		
	}

	public Book(String name, Date publishDate, Author author) {
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
	}

	
	// Setters & Getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}	
}
