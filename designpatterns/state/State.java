/**
 * @author Duncan Szabaga
 */

public interface State {
    /**
     * Get the number for the question
     * @return int Random number
     */
    public int getNum();

    /**
     * Returns the operator for the question
     * @return Operation Random operator
     */
    public Operation getOperation();

    /**
     * Increases the difficulty
     */
    public void increaseDifficulty();

    /**
     * Decreases the difficulty
     */
    public void decreaseDifficulty();
}
