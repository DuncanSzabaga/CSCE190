package strategy;

import java.util.*;

public class Attendees{
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     * Constructor for the Attendees class
     * @param title The name of the Attendees list
     * @param people The list of attendees
     * @param searchBehavior Decides if it does a linear search or binary search
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new LinkedList<>();
        this.searchBehavior = new LinearSearch();
    }
    /**
     * Gets the title of the attendees 
     * @return Tile of the attendees
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the list of people for the attendees 
     * @return list of people
     */
    public List<Person> getList() {
        return people;
    }

    /** 
     * Sets the search behavior of the attendees 
     * @param searchBehavior either linear search or binary search
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /** 
     * If the person trying to be added to the list is not already on the list, returns the person, 
     * otherwise returns null. Also sorts the list by name order. 
     * @param firstName The persons first name
     * @param lastName The persons last name
     * @param phoneNumber The persons phone number
     * @param reminder The note saved about the person
     * @return null or new person's information depending on if the person is already in the list or not.
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person newPerson = new Person(firstName, lastName, phoneNumber, reminder);
        if(searchBehavior.contains(people, newPerson)) {
        return null;
        }
        people.add(newPerson);
        people.sort((a, b) -> a.compareTo(b));
        return newPerson;
    }
}
