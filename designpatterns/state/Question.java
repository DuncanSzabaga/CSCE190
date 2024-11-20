/**
 * @author Duncan Szabaga
 */

public class Question extends ArithemeticGame{
    private String question;
    private int answer;

    /**
     * Constructor for the Question class
     * @param num1 First number used in the equation
     * @param num2 Second number used in the equation
     * @param operation Operator used in the equation
     */
    public Question(int num1, int num2, Operation operation) {
        this.question = num1 + " " + operation.label + " " + num2;
        switch (operation) {
            case Operation.PLUS:
                this.answer = num1 + num2;
                break;
            case Operation.MINUS:
                this.answer = num1 - num2;
                break;
            case Operation.MULTIPLY:
                this.answer = num1 * num2;
                break;
            case Operation.DIVIDE:
                this.answer = num1 / num2;
                break;
            default:
                System.out.println("\nError when generating question");
                this.answer = -9999;
                break;
        }
    }

    /**
     * Gets the answer of the equation
     * @return int Answer of the equation
     */
    public int getAnswer() {
        return answer;
    }

    /**
     * Compares the user's answer with the correct answer
     * @param userAnswer The answer the user inputs
     * @return boolean True if the user's answer and the correct answer are the same
     */
    public boolean isCorrect(int userAnswer) {
        return(this.answer == userAnswer);
    }

    /**
     * Returns the question as a string
     * @param String The question
     */
    public String toString() {
        return "Question: " + question;
    }
}
