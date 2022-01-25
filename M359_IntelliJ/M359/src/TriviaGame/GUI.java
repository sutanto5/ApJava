package TriviaGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JLabel;
import java.lang.*;


public class GUI implements ActionListener {
    private static GUI game;
    private static TriviaGame trivia;
    private static Question[] questions;
    String ans;

    JTextArea textArea;
    JTextArea scoreCard;
    JButton button;
    JFrame frame;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel blank;
    JButton[] buttons = new JButton[4];
    int corrInd = 0;
    public static int count = 0;

    public GUI(Question question, String name){
        //creates the window
        frame = new JFrame();

        ans = question.getCorrectAnswer();

        String[] answers = question.getAnswerChoice();

        //create a button
        button = new JButton(answers[0]);
        button.addActionListener(this);
        buttons[0] = button;

        button2 = new JButton(answers[1]);
        button2.addActionListener(this);
        buttons[1] = button2;

        button3 = new JButton(answers[2]);
        button3.addActionListener(this);
        buttons[2] = button3;

        button4 = new JButton(answers[3]);
        button4.addActionListener(this);
        buttons[3] = button4;

        textArea = new JTextArea(question.getQuestion(), 6, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        scoreCard = new JTextArea("Score: " + count);
        scoreCard.setLineWrap(true);
        scoreCard.setWrapStyleWord(true);
        scoreCard.setOpaque(false);
        scoreCard.setEditable(true);


        //layout instantiate
        JPanel panel = new JPanel();

        //using the objects (Border factory params = top, left, bottom, right
        panel.setBorder(BorderFactory.createEmptyBorder(40, 10, 30, 30));
        panel.setLayout(new GridLayout(2, 2));


        //GET THE CORRECT INDEX FOR THE ANSWER
        for(JButton x: buttons){
            if(x.getText().equalsIgnoreCase(ans)) {
                break;
            }
            else{
                corrInd++;
            }
        }

        //adding components
        panel.add(textArea);

        panel.add(button);
        panel.add(button2);

        panel.add(scoreCard);
        panel.add(button3);
        panel.add(button4);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Gui");
        frame.pack();
        frame.setVisible(true);
    }

    public static GUI getGame() {
        return game;
    }

    public static TriviaGame getTrivia() {
        return trivia;
    }

    public static void setTrivia(TriviaGame trivia) {
        GUI.trivia = trivia;
    }

    public static Question[] getQuestions() {
        return questions;
    }

    public static void setQuestions(Question[] questions) {
        GUI.questions = questions;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JTextArea getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(JTextArea scoreCard) {
        this.scoreCard = scoreCard;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JLabel getBlank() {
        return blank;
    }

    public void setBlank(JLabel blank) {
        this.blank = blank;
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
    }

    public int getCorrInd() {
        return corrInd;
    }

    public void setCorrInd(int corrInd) {
        this.corrInd = corrInd;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        GUI.count = count;
    }

    public static void setGame(GUI game) {
        GUI.game = game;
    }

    public static void main(String[] args) throws FileNotFoundException {
        trivia = new TriviaGame(TriviaGame.chooseCategory());
        questions = trivia.getTriviaQs();
        game = new GUI(runGame(questions), "Joshua");

    }

    // Need to redo restart function
    public static Question runGame(Question[] triviaQs) {

        int rand = (int) (Math.random() * triviaQs.length);
        return  triviaQs[rand];

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(JButton x: buttons){
            if(e.getSource() == x){
                x.setBackground(Color.RED);
            }

        }

        if(e.getSource() == buttons[corrInd]){
            count++;
        }
        else{
            count--;
        }


        try {
            buttons[corrInd].setBackground(Color.green);
            textArea.setText("The correct answer was: " + ans);
            scoreCard.setText("Joshua, your score is: " + count);
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        game.getFrame().setVisible(false);
        game = new GUI(runGame(questions), "Joshua");


    }

}

