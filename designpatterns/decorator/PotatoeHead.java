package decorator;

public class PotatoeHead extends Character{

    /**
     * Constructor for the PotatoeHead class
     * @param name Name of the potatoe head
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("decorator/txt/potatoe-head.txt"), name);
        
    }
}
