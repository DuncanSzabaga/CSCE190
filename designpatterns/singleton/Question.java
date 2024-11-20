/**
 * @author Duncan Szabaga
 */
package singleton;
import java.util.ArrayList;

public class Question extends DataLoader{

    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Constructor for the Question class
     * @param prompt Question the user needs to answer
     * @param correctAns Correct answer for the question
     * @param answers List of answers for the question
     */
    public Question(String prompt, int correctAns, String[] answers){
        this.question = prompt;
        this.correctAnswer = correctAns;
        this.answers = new ArrayList<String>();
        for(int i = 0;i < answers.length; i++) {
            this.answers.add(answers[i]);
        }
    }

    /**
     * Converts the question and answers to a String
     * @return String Question and answers
     */
    public String toString() {
        String newString = this.question; 
        for(int i = 0; i<answers.size();i++) {
            newString += "\n" + (i+1) + ". " + answers.get(i);
        }
        return newString;
    }

    /**
     * Checks of the input answer is equal to the correct answer
     * @param userAnswer Input answer
     * @return boolean Input answer equals correct answer
     */
    public boolean isCorrect(int userAnswer) {
        return (userAnswer-1 == this.correctAnswer);
    }

    /**
     * Gets the correct answer  of the question
     * @return String answer
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }

    
}
