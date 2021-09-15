package Unit2_UsingObjects.examples;
import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args){
        //declaring the scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        //saving a scanner input into a variable
        String name = input.nextLine();
        System.out.println("your name is: " + name);

        System.out.println("What is your age? ");
        //integer say nextint
        int age = input.nextInt();
        System.out.println("My age is: " + age);

        System.out.println("what is your gpa?");
        double gpa = input.nextDouble();

    }
}
