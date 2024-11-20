package decorator;

import java.util.ArrayList;

public class Character {
    protected static String name;
    protected static ArrayList<String> lines;

    /**
     * Constructor for the Character class
     * @param lines An array list of strings that contains the potatoe head
     * @param name Name of the potatoe head
     */
    public Character(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
        
    }
    /**
     * Gets the name of the potatoe head
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Converts the potatoe head to a string, line by line
     * @return String potatoe head
     */
    public String toString() {
        String newPotato = "";
        for (int i = 0; i < lines.size(); i++) {
            newPotato += lines.get(i);
            newPotato += "\n";
        }
        return newPotato; 
    }
}
