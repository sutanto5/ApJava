package GamerTime;

public class RockPaperScissors {
    public static void main(String[] args) {
        int choice = computerRockPaperScissors();

    }

    public static int computerRockPaperScissors(){
        int choice = (int)(Math.random() * 3) + 1;
        return choice;
    }
}
