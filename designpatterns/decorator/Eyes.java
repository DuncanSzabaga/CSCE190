package decorator;

public class Eyes extends CharacterDecorator{

    /**
     * Constructor for the Eyes class
     * @param character Character class object
     */
    public Eyes(Character character) {
        super(character);
        super.integrateDecor(FileReader.getLines("decorator/txt/eyes.txt"));
    }
}
