package strategy;

import java.util.List;

public class LinearSearch implements SearchBehavior {

    /**
     * Goes through each person in order from first to last. 
     * @param people list of people to search through
     * @param person target name 
     * @return true or false depending on if it finds the name in the list or not
     */
    public boolean contains(List<Person> people, Person person) {
        for(Person newPerson : people) {
            if(person.equals(newPerson))
                return true;
        }
        return false;
    }
}
