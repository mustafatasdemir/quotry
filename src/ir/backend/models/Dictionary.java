package ir.backend.models;

import java.sql.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "dictionary")
public class Dictionary {

	// Column attributes for DB
	
	public static final String ID_COLUMN = "id";
	public static final String ENTRY_COLUMN = "name";
	public static final String WORD = "middle_name";
	public static final String MEANING = "last_name";
	

	
	// Instance variables
	
	@DatabaseField(columnName = ID_COLUMN, generatedId = true)
	private int id;
	
	@DatabaseField(columnName = ENTRY_COLUMN)
	private Entry entry;
	
	@DatabaseField(columnName = WORD)
	private String word;
	
	@DatabaseField(columnName = MEANING)
	private String meanings;
	
	
	
	// Constructors
	
	public Dictionary() {

	}
	
	
	public Dictionary(Entry entry, String word, String meanings) {
		this.entry = entry;
		this.word = word;
		this.meanings = meanings;
	}


	// Setters & Getters
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Entry getEntry() {
		return entry;
	}


	public void setEntry(Entry entry) {
		this.entry = entry;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public String getMeanings() {
		return meanings;
	}


	public void setMeanings(String meanings) {
		this.meanings = meanings;
	}
}
