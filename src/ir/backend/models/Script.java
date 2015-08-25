package ir.backend.models;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "scripts")
public class Script extends Entry {
	

	public Script() {
		
	}
	
	public Script(String content, Author author,  Book book) {
		super.setContent(content);
		super.setAuthor(author);
		super.setBook(book);
	}


}
