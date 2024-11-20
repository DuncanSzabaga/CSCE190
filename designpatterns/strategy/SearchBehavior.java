package strategy;

import java.util.List;

public interface SearchBehavior {
    /**
     * Interface for both search methods
     * @param people List of people
     * @param person Target person
     */
    public boolean contains(List<Person> people, Person person);
    
}
