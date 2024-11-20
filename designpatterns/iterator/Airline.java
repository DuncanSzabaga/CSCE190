/**
 * @author Duncan Szabaga
 */
import java.util.ArrayList;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructor for the Airline class
     * @param title Title of the Airline object
     */
    public Airline (String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    /**
     * Get the title of the airline
     * @return String - title of the airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Create the iterator for the flights using the origin and destination the user inputs
     * @param fromCode Origin airport input by the user
     * @param toCode Destination airport input by the user
     * @return FlightIterator - The FlightIterator object with the correct list of flights
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode);
            Airport to = Airport.valueOf(toCode);
            FlightIterator newFlights = new FlightIterator(this.flights, from, to);
            return newFlights;
        } catch (IllegalArgumentException e) {
            System.out.println("Origin or destination airport code does not exist.");
            return null;
        }
    }
}
