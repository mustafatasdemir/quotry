package ir.backend.models;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "quotes")
public class Quote extends Entry {

	
	
	
	public Quote() {

	}
	
	public Quote(String content, Author author,  Book book) {
		super.setContent(content);
		super.setAuthor(author);
		super.setBook(book);
	}

}
