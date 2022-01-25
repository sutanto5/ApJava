package Unit6_Arrays.CourseExample;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class SchedueleReadingExample {
    public static void main(String[] args) throws FileNotFoundException{
        File schedueleFile = new File("scheduleData.txt");
        Scanner fileIn = new Scanner(schedueleFile);

        //prints the amount of students in the class
        int stuAmount = fileIn.nextInt();

        //dummy read needed to get to next line
        fileIn.nextLine();

        //Creates an array of appropriate size to hold all students
        Student[] myStudents = new Student[stuAmount];

        int studentCount = 0;
        while(fileIn.hasNextLine()){
            //first read in student name
            String stuName = fileIn.nextLine();


            Course[] allClasses = new Course[8];
            //runs 8 times for each period
            for(int i = 0; i < 8; i++){
                String teacher = fileIn.nextLine();
                String subject = fileIn.nextLine();
                String grade = fileIn.nextLine();
                int period = fileIn.nextInt();

                if(fileIn.hasNextLine()) {
                    fileIn.nextLine();
                }

                Course course = new Course(teacher, subject, grade, period);
                allClasses[i] = course;



            }



            Student person = new Student(stuName, allClasses);

            myStudents[studentCount] = person;
            studentCount++;

            /*quick check for functionality
            for(Course c: allClasses){
                System.out.println(c);
            }
            return;
            */

        }

        printAllStudentSchedueles(myStudents);


    }
    public static void printAllStudentSchedueles(Student[] allStudents){
        for (Student i: allStudents){
            if(i != null) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}


