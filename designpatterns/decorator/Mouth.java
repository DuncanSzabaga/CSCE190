package decorator;

public class Mouth extends CharacterDecorator{

    /**
     * Constructor for the Mouth class
     * @param character Character class object
     */
    public Mouth(Character character) {
        super(character);
        super.integrateDecor(FileReader.getLines("decorator/txt/mouth.txt"));
    }
}
