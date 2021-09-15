package Unit2_UsingObjects.Quiz;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String name;
    private int mcNumber;
    private boolean extraCredit;


    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz (){
        name = "M359 Pop Quiz";
        mcNumber = 3;
        extraCredit = false;
    }

    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String quizName, int numberOfMC, boolean isExtraCredit){
        name = quizName;
        mcNumber = numberOfMC;
        extraCredit = isExtraCredit;
    }


    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */
    public void printInfo(){
        System.out.println("\t" + name);
        System.out.println("\t\t Number MC's: " + mcNumber);
        System.out.println("\t\t Has EC:" + extraCredit);
    }

    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything
    public void addMC(int numQuestions){
        mcNumber += numQuestions;
    }

    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]
    public int calcExtraCredit(){
        return (int) (Math.random() * 5) + 2;
    }

    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int pointValue){
        int total = mcNumber * pointValue;
        return total;
    }

    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods
    public String getName(){
        return name;
    }

    public int getMcNumber(){
        return mcNumber;
    }

    public boolean getExtraCredit(){
        return extraCredit;
    }

    public void setName(String aName){
        name = aName;
    }

    public void setMcNumber(int numMC){
        mcNumber = numMC;
    }

    public void setExtraCredit(boolean isExtraCredit){
        extraCredit = isExtraCredit;
    }

    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"
    public String returnLastName(String fullName){
        int space = fullName.indexOf(" ");
        String lastName = fullName.substring(space+1);
        return lastName;
    }

}
