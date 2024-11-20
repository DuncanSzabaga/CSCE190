/**
 * @author Duncan Szabaga
 */
package singleton;
import java.util.ArrayList;
import java.util.Random;

public class TriviaGame{
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    /**
     * Constructor for the TriviaGame class
     */
    private TriviaGame(){
        this.score = 0;
        this.numGames = 0;
        this.rand = new Random();
        this.questions = DataLoader.getTriviaQuestions();
    }

    /**
     * Gets the instance of the TriviaGame
     * @return TriviaGame instance
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Gets the question for the user to answer. If there are no more questions, resets the game.
     * @return Question A randomly chosen question
     */
    public Question getQuestion() {
        if (hasMoreQuestions()){
            int index = rand.nextInt(questions.size());
            return questions.remove(index);
        } else {
            this.score = 0;
            this.numGames = 0;
            this.questions = DataLoader.getTriviaQuestions();
            int index = rand.nextInt(questions.size());
            return questions.remove(index);
        }
    }

    /**
     * Check if there are more questions to answer
     * @return boolean Is this list of questions empty
     */
    public boolean hasMoreQuestions(){
        return !questions.isEmpty();
    }

    /**
     * Increase the score if the player gets the question right, then increase the number of questions answered.
     * If there are no more questions, print the user's score and reset the game.
     */
    public void winRound() {
        this.score += 1;
        this.numGames += 1;
        if(!hasMoreQuestions())
            System.out.println("\nYou scored " + this.score + "/" + this.numGames);
    }

    /**
     * Don't increase the score if the player gets the question right, then increase the number of questions answered.
     * If there are no more questions, print the user's score and reset the game.
     */
    public void loseRound() {
        this.numGames += 1;
        if(!hasMoreQuestions())
            System.out.println("\nYou scored " + this.score + "/" + this.numGames);
    }

    /**
     * Gets the total score over the number of questions answered
     * @return String Total score
     */
    public String getScores() {
        return "You scored " + this.score + "/" + this.numGames;
    }
}
