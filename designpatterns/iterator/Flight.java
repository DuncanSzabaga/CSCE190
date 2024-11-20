/**
 * @author Duncan Szabaga
 */
import java.time.LocalTime;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;
    
    /**
     * Constructor for the Flight class
     * @param flightNum Number of the Flight
     * @param from Origin Airport for the Flight
     * @param to Destination Airport for the Flight
     * @param startTime Time the Flight starts
     * @param endTime Time the Flight ends
     * @param numTransfers Number of transfers on the Flight
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Get the origin airport for the Flight
     * @return Airport - Origin Airport
     */
    public Airport getFrom() {
        return this.from;
    }

    /**
     * Get the destination airport for the Flight
     * @return Airport - Destination Airport
     */
    public Airport getTo() {
        return this.to;
    }

    /**
     * Checks to see if the origin and destination airports for the Flight are the correct origin and destination
     * @param from Origin Airport
     * @param to Destination Airport
     * @return boolean - Return true if the passed origin and destination airports match the saved origin and destination airports
     */
    public boolean sameLoc(Airport from, Airport to) {
        return from == this.from && to == this.to;
    }

    /**
     * Converts the Flight information to a string to print out
     * @return String - Flight information
     */
    public String toString() {
        String transfer;
        int hours, minutes;
        switch(this.numTransfers) {
            case 0:
                transfer = "Direct Flight";
                break;
            case 1:
                transfer = "1 Stopover";
                break;
            default:
                transfer = this.numTransfers + " Transfers";
                break;
        }
        hours = (this.endTime.getHour() - this.startTime.getHour());
        minutes = (this.endTime.getMinute() - this.startTime.getMinute());
        if (minutes < 0) {
            hours -= 1;
            minutes += 60;
        }
        return this.from + " to " + this.to + " " + this.startTime + " - " + this.endTime + " (" + hours + "h " + minutes + "m) " + transfer;

    }
}

