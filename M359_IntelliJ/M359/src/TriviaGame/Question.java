package TriviaGame;

import java.util.Scanner;

public class Question {

    //instance variables
    private String question;
    private String[] answerChoice;
    private String correctAnswer;
    private int pointVal;

    //global variable to make questions not show answers
    public static boolean makeHard = false;

    //constructor
    public Question(String question, String[] answerChoice, String correctAnswer, int pointVal) {
        this.question = question;
        this.answerChoice = answerChoice;
        this.correctAnswer = correctAnswer;
        this.pointVal = pointVal;
    }

    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(String[] answerChoice) {
        this.answerChoice = answerChoice;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointVal() {
        return pointVal;
    }

    public void setPointVal(int pointVal) {
        this.pointVal = pointVal;
    }


    /**
     * This method wraps the text if the question gets too long
     */
    public void displayQuestion(){
        String formattedQ = "";
        String copy = question;
        int length = question.length();
        int times = length/40;
        for(int i = 0; i < times; i++){
            String aboveFourty = copy.substring(40);
            int space = aboveFourty.indexOf(" ") + 40;
            formattedQ += copy.substring(0, space);
            formattedQ += "\n";
            copy = copy.substring(space);
        }
        question = formattedQ + copy;

    }

    /**
     * This method prints out a formatted string of the question
     * @return String with formatted output
     */
    public String toString(){
        String output = "***************************************\n";
        displayQuestion();
        output += "Question: " + this.question + "\nPoint Value: " + this.pointVal;
        if(makeHard == false){
            for(String ans: answerChoice){
                output += "\n\t\t" + ans;
            }
        }
        output += "\n***************************************";
        return output;
    }

    /**
     This method, upon player input, hides the answers
     */
    public static void makeHard() {
        Scanner player = new Scanner(System.in);

        System.out.println("Which mode do you want it in - " + TriviaGame.RED + "Hard " + TriviaGame.RESET + "or " + TriviaGame.GREEN + "Easy?" + TriviaGame.RESET
                + " Type \"Hard\" for " + TriviaGame.RED + "hard " + TriviaGame.RESET + "| Type nothing for " + TriviaGame.GREEN + " easy" + TriviaGame.RESET);
        if (player.nextLine().equalsIgnoreCase("Hard")) {
            Question.makeHard = true;
        } else {
            Question.makeHard = false;
        }
    }
}

