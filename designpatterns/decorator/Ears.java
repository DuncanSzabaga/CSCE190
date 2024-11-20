package decorator;

public class Ears extends CharacterDecorator{

    /**
     * Constructor for the Ears class
     * @param character Character class object
     */
    public Ears(Character character) {
        super(character);
        super.integrateDecor(FileReader.getLines("decorator/txt/ears.txt"));
    }
}
