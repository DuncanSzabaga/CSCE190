package decorator;

public class Nose extends CharacterDecorator{

    /**
     * Constructor for the Nose class
     * @param character Character class object
     */
    public Nose(Character character) {
        super(character);
        super.integrateDecor(FileReader.getLines("decorator/txt/nose.txt"));
    }
}
