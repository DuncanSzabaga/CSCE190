/**
 * @author Duncan Szabaga
 */

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Constructor for the ArithemeticGame class
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.state = easyState;
        this.score = 0;
    }

    /**
     * Returns a new question for the user to answer
     * @return Question The new question
     */
    public Question getQuestion() {
        Question newQuestion = new Question(state.getNum(), state.getNum(), state.getOperation());
        return newQuestion;
    }

    /**
     * Increases the score, then increases difficulty if the user meets the requirements
     */
    public void increaseScore() {
        this.score += 1;
        if(this.state == easyState && this.score >= 3) 
            state.increaseDifficulty();
        if(this.state == mediumState && this.score >= 6)
            state.increaseDifficulty();
        if(this.state == hardState && this.score >= 9)
            state.increaseDifficulty();
    }

    /**
     * Decreases the score, then decreases difficulty if the user meets the requirements
     */
    public void decreaseScore() {
        this.score -= 1;
        if(this.state == easyState && this.score <= -3)
            state.decreaseDifficulty();
        if(this.state == mediumState && this.score < 3)
            state.decreaseDifficulty();
        if(this.state == hardState && this.score < 6)
            state.decreaseDifficulty();
    }

    /**
     * Sets the state of the ArithemeticGame class
     * @param state The state of the ArithemeticGame class
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the easyState object
     * @return State easyState
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Returns the mediumState object
     * @return State mediumState
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Returns the hardState object
     * @return State hardState
     */
    public State getHardState() {
        return hardState;
    }
}
