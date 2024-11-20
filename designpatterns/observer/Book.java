package observer;

public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Constructor for the book class
     * @param title Title of the book
     * @param genre Genre of the book
     * @param authorFirstName Book author's first name
     * @param authorLastName Book author's last name
     * @param description Description of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;

    }

    
    /** 
     * Gets the title of the book
     * @return String title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the genre of the book
     * @return Genre genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Gets the author's first name
     * @return String authorFirstName
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Gets the author's last name
     * @return String authorLastName
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Gets the description of the book
     * @return String description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Converts the information of the book to a string
     * @return String book information
     */
    public String toString() {
        return "\n----- "+ this.title + "-----\n" + this.genre + " by: " + this.authorFirstName + " " + this.authorLastName + "\n" + this.description;
    }
}
