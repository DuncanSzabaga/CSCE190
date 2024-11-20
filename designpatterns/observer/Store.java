package observer;

import java.util.*;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructor for the Store class
     * @param subject The subject object
     */
    public Store(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
        this.bestSellers = new LinkedList<Book>();
    }

    
    /** 
     * Updates the queue with the newest book, removes a book if the queue already has five objects
     * @param book The book being added
     */
    public void update(Book book) {
        if(bestSellers.size() < 5) {
            bestSellers.add(book);
        } else {
            bestSellers.remove();
            bestSellers.add(book);
        }
    }

    /**
     * Gets the list of best sellers
     * @return List<Book> A list of best sellers
     */
    public List<Book> getBestSellers() {
        return (List)bestSellers;
    }
}
