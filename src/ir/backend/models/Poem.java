package ir.backend.models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "poems")
public class Poem extends Entry {

	// Column attributes for DB
	
	public static final String VERSE_COUNT = "verse_count";
	

	
	// Instance variables
	
	@DatabaseField(columnName = VERSE_COUNT)
	private int verseCount;
	
	
	// Constructors
	
	public Poem() {
		
	}
	
	public Poem(String content, Author author,  Book book, int verseCount) {
		super.setContent(content);
		super.setAuthor(author);
		super.setBook(book);
		this.verseCount = verseCount;
	}

}
