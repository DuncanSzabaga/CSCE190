/**
 * @author Duncan Szabaga
 */
import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator{
    private ArrayList<Flight> flights;
    private int position = 0;
    private Airport from;
    private Airport to;

    /**
     * Constructor for the FlightIterator class
     * @param flights ArrayList of flights
     * @param from Origin Airport
     * @param to Destination Airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {        
        this.from = from;
        this.to = to;
        this.flights = flights;
    }

    /**
     * The next method for the iterator
     * @return If there is a next flight, return the next flight
     */
    public Flight next() {
        if(hasNext()) {
            return flights.get(this.position++);
        }
        return null;
    }

    /**
     * The hasNext method for the iterator
     * @return boolean - true if the next Flight matches the users desired origin and destination and there are still flights left to check.
     */
    public boolean hasNext() {
        while (this.position < flights.size()) {
            Flight nextFlight = flights.get(this.position);
            if(nextFlight.sameLoc(this.from, this.to))
                return true;
            this.position += 1;
        }
        return false;
    }
}
