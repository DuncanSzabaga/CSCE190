/**
 * @author Duncan Szabaga
 */

import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Hard class
     * @param game ArithemeticClass object
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randomNum = new Random().nextInt(50 - 1 + 1) + 1; 
        return randomNum;
    }

    public Operation getOperation() {
        int randomOperation = new Random().nextInt(4 - 1 + 1) + 1; 
        switch (randomOperation) {
            case 1:
                return Operation.PLUS;
            case 2:
                return Operation.MINUS;
            case 3:
                return Operation.MULTIPLY;
            case 4:
                return Operation.DIVIDE;
            default:
                return Operation.PLUS;
        }
    }

    public void increaseDifficulty() {
        System.out.println("\nYou're great at this!");
    }

    public void decreaseDifficulty() {
        System.out.println("\nDifficulty has decreased to Medium");
        game.setState(game.getMediumState());
    }
}
