package decorator;

import decorator.Character;
import java.util.ArrayList;

public class CharacterDecorator extends Character{
    private Character character;

    /**
     * Constructor for the CharacterDecorator class
     * @param character Character class object
     */
    public CharacterDecorator(Character character) {
        super(lines, name);
    }

    /**
     * Integrates the decoration into the original potatoe head
     * @param decor The decoration being added
     */
    protected void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> linesCopy = lines;

        for (int i = 0; i < lines.size(); i++) {
            //Converts the line String into an array of characters
            char[] charArray = linesCopy.get(i).toCharArray();
            if (decor.get(i).isEmpty() == false) {
                /* Converts the decor String into an array of characters if it's not empty, and creates an
                array for cases where the array is too big for the original line */
                char[] insertArray = decor.get(i).toCharArray();
                char[] insertLength = new char[insertArray.length];

                for (int j = 0; j <= insertArray.length-1; j++) {
                    //Checks to see if the line String array is too small
                    if (j > charArray.length-1) {
                        for (int w = 0; w <= charArray.length-1; w++) {
                            insertLength[w] = charArray[w];
                        }
                        insertLength[j] = insertArray[j];
                    }
                    else if (charArray[j] == ' ') {
                        charArray[j] = insertArray[j];
                    }
                }
                //The new line being added to the original potatoe head
                String newLine = new String(insertLength);
                    //If the array was too small it runs this
                    if(insertLength.length > charArray.length) {
                        linesCopy.set(i, newLine);
                    } else {
                    newLine = new String(charArray);
                    linesCopy.set(i, newLine);
                }
            }
        }
        lines = linesCopy;
    }
}
