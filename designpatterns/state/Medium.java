/**
 * @author Duncan Szabaga
 */

import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;

    /**
     * Constructor for the Medium class
     * @param game ArithemeticGame object
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    public int getNum() {
        int randomNum = new Random().nextInt(25 - 1 + 1) + 1; 
        return randomNum;
    }

    public Operation getOperation() {
        int randomOperation = new Random().nextInt(3 - 1 + 1) + 1; 
        if (randomOperation == 1) {
            return Operation.PLUS;
        } else if (randomOperation == 2) {
            return Operation.MINUS;
        } else {
            return Operation.MULTIPLY;
        }
    }

    public void increaseDifficulty() {
        System.out.println("\nDifficulty has increased to Hard");
        game.setState(game.getHardState());
    }

    public void decreaseDifficulty() {
        System.out.println("\nDifficulty has decreased to Easy");
        game.setState(game.getEasyState());
    }
}
