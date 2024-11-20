/**
 * @author Duncan Szabaga
 */

import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Easy class
     * @param game ArithemeticGame object
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randomNum = new Random().nextInt(10 - 1 + 1) + 1; 
        return randomNum;
    }

    public Operation getOperation() {
        int randomOperation = new Random().nextInt(2 - 1 + 1) + 1; 
        if (randomOperation == 1) {
            return Operation.PLUS;
        } else {
            return Operation.MINUS;
        }
    }

    public void increaseDifficulty() {
        System.out.println("\nDifficulty has increased to Medium");
        game.setState(game.getMediumState());
    }

    public void decreaseDifficulty() {
        System.out.println("\nKeep trying!");
    }
}
