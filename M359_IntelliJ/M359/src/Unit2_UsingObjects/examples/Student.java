package Unit2_UsingObjects.examples;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;


    public Student(String studentName, int grade, double average) {

        name = studentName;
        gradeLevel = grade;
        gpa = average;

    }

    public Student(String student) {
        name = student;
    }

    Student s1 = new Student("Mike", 10, 3.87);
    Student s2 = new Student("Varsha");


}
