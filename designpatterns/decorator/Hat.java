package decorator;

public class Hat extends CharacterDecorator{

    /**
     * Constructor for the Hat class
     * @param character Character class object
     */
    public Hat(Character character) {
        super(character);
        super.integrateDecor(FileReader.getLines("decorator/txt/hat.txt"));
    }
}
