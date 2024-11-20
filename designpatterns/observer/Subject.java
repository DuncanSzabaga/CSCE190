package observer;

/**
 * Interface for the BestSellers class
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);
}
