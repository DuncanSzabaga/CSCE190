package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class FanReads implements Observer{
    private Subject subject;
    HashMap<Genre, ArrayList<Book>> recommendations = new HashMap<>();

    /**
     * Constructor for the FanReads class
     * @param subject The subject object
     * @param firstName Person's first name
     * @param lastName Person's last name
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);        
    }

    
    /** 
     * Creates a list of books for the genre if none exists, then adds the book to the list based on genre
     * @param book The book being added
     */
    public void update(Book book) {
        if (recommendations.get(book.getGenre()) == null) {
            recommendations.put(book.getGenre(), new ArrayList<Book>());
        }
            recommendations.get(book.getGenre()).add(book);
    }

    /**
     * Gets a list of book recommendations for the specific genre
     * @param genre The genre requested
     * @return ArrayList<Book> List of books based on genre
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);
    }
}
