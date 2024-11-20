package observer;

import java.util.*;

public class BestSellers implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Constructor for the BestSellers class
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    @Override
    /**
     * Registers a class to the observer
     * @param observer The observer object
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    /**
     * Removes a class from the observer
     * @param observer The observer object
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    /**
     * Notifies the observers that the object was updated
     * @param book The object being added
     */
	public void notifyObservers(Book book) {
		for(Observer observer : observers) {
			observer.update(book);
        }
    }

    /**
     * Adds a new book to the list of books
     * @param title Title of the book
     * @param genre Genre of the book
     * @param authorFirstName Book author's first name
     * @param authorLastName Book author's last name
     * @param description Description of the book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book newBook = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(newBook);
        notifyObservers(newBook);
    }
}
