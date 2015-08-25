package ir.backend.models;

import java.sql.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Author {
	
	
	// Column attributes for DB
	
	public static final String ID_COLUMN = "id";
	public static final String NAME_COLUMN = "name";
	public static final String MIDDLE_NAME_COLUMN = "middle_name";
	public static final String LAST_NAME_COLUMN = "last_name";
	public static final String NICK_NAME_COLUMN = "nick_name";
	public static final String DOB_COLUMN = "dob";
	public static final String DOD_COLUMN = "dod";
	public static final String BIOGRAPHY_COLUMN = "bio";
	public static final String URL_COLUMN = "url";
	
	
	// Instance variables
	
	@DatabaseField(columnName = ID_COLUMN, generatedId = true)
	private int id;
	
	@DatabaseField(columnName = NAME_COLUMN, canBeNull = false)
	private String name;
	
	@DatabaseField(columnName = MIDDLE_NAME_COLUMN)
	private String middleName;
	
	@DatabaseField(columnName = LAST_NAME_COLUMN)
	private String lastName;
	
	@DatabaseField(columnName = NICK_NAME_COLUMN)
	private String nickName;
	
	@DatabaseField(columnName = DOB_COLUMN,	dataType = DataType.DATE_STRING)
	private Date dateOfBirth;
	
	@DatabaseField(columnName = DOD_COLUMN,	dataType = DataType.DATE_STRING)
	private Date dateOfDeath;
	
	@DatabaseField(columnName = BIOGRAPHY_COLUMN)
	private String bio;
	
	@DatabaseField(columnName = URL_COLUMN)
	private String url;
	
	
	// Constructors	
	
	public Author() {

	}
	
	public Author(String name, String middleName, String lastName){
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Author(String name,
			String middleName,
			String lastName,
			String nickName,
			Date dob,
			Date dod,
			String bio,
			String url){
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	
	// Getters & Setters
	
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

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return name + " " + middleName + " " + lastName; 
	}
}
