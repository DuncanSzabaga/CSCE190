package strategy;

import java.util.List;

public class BinarySearch implements SearchBehavior {

        /** 
         * Compares the name of the person being added to the person in the middle of the list.
         * @param people list of people to search through
         * @param person target name
         * @return true or false if name is found in list or not respectively.
         */
    public boolean contains(List<Person> people, Person person) {
        /**
         *  Index values 
         */
        int left = 0;
        int right = people.size()-1;

        
        while (left <= right) {
            int mid = ((left + right) / 2);
            Person midPerson = people.get(mid);
            if(person.compareTo(midPerson) > 0)
                left = mid + 1;
            else if (person.compareTo(midPerson) < 0)
                right = mid - 1;
            else
                return true;
            /**
             * Originally tried switch statement, error with overridden compareTo method 
             * (returned a different value than 1, -1, or 0, caused an infinite loop).
             * 
            switch(person.compareTo(midPerson)){
                case 1:
                    left = mid + 1;
                    break;
                case -1:
                    right = mid - 1;
                    break;
                case 0:
                    return true;
                default:
                    System.out.println(person.compareTo(midPerson)); 
            }
            */
        }
        return false;
    }
}
