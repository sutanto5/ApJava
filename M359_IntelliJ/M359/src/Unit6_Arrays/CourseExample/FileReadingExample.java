package Unit6_Arrays.CourseExample;

/**
 * This will show us how to access a text file and read in data
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReadingExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("courseData.txt");
        Scanner fileIn = new Scanner(myFile);

        String teacherName = fileIn.nextLine(); //should be Vlaming
        String className = fileIn.nextLine();   //Basketball PE
        int periodNumber = fileIn.nextInt();    //1
        fileIn.nextLine(); //dummy read to go into next line after 1
        String grade = fileIn.nextLine();       //A

        System.out.println(teacherName);
        System.out.println(className);
        System.out.println(periodNumber);
        System.out.println(grade);
    }
}
