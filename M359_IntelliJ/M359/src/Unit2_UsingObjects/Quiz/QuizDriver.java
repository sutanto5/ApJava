package Unit2_UsingObjects.Quiz;

public class QuizDriver
{
    public static void main(String[] args)
    {
        // Create default popQuiz and customized unit2Quiz objects
        Quiz popQuiz = new Quiz();
        Quiz unit2Quiz = new Quiz("M359 Unit 2 Quiz", 4,true);

        // Print popquiz information
        popQuiz.printInfo();
        System.out.println();

        // Add two MC's to popQuiz
        popQuiz.addMC(2);

        // *** WRITE CODE HERE ***
        // Part I
        // Calculate popQuiz total points with 1 point per MC
        // Store in an appropriate variable
        int quizTotal = popQuiz.calcTotal(1);

        // *** WRITE CODE HERE ***
        // Part J
        // Print popQuiz information along with total points
        // Ex:  QUIZ NAME
        //          Number MC's:    #
        //          Has EC:      true/false
        //          Total Points:   #
        popQuiz.printInfo();
        System.out.println("\t\t Total Points: " + quizTotal);
        System.out.println();

        // Print unit2Quiz information
        unit2Quiz.printInfo();
        System.out.println();

        // Change unit2Quiz name to M359 Unit 2 Programming Quiz
        unit2Quiz.setName("M359 Unit 2 Programming Quiz");

        // *** WRITE CODE HERE ***
        // Part K
        // Calculate unit2Quiz total points with 3 point per MC
        // Store in an appropriate variable
        int unitTwoTotal = unit2Quiz.calcTotal(3);

        // *** WRITE CODE HERE ***
        // Part L
        // Calculate unit2Quiz extra credit
        // Store in an appropriate variable
        int extraCreditAmount = unit2Quiz.calcExtraCredit();

        // *** WRITE CODE HERE ***
        // Part M
        // Print unit2Quiz information along with total points
        // Ex:  QUIZ NAME
        //          Number MC's:    #
        //          Has EC:         true/false
        //          Extra Credit:   #
        //          Total Points:   # (includes extra credit)
        unit2Quiz.printInfo();
        System.out.println("\t\t Extra Credit: "+ extraCreditAmount);
        System.out.println("\t\t Total Points: " + (unitTwoTotal + extraCreditAmount));


        // *** EXTRA CREDIT ***
        // Uncomment the following code segment once you complete
        // the extra credit method in Quiz.java
        System.out.println("\nLast Name: ");
        System.out.println(unit2Quiz.returnLastName("Arnold Schwarzenegger"));
    }
}
