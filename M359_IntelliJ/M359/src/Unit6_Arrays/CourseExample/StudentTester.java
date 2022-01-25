package Unit6_Arrays.CourseExample;

public class StudentTester {
    public static void main(String[] args) {
        String name = "Joshua Sutanto";
        Course per1 = new Course("Dinham", "Gym", "A+", 1);
        Course per2 = new Course("Carlsen", "Chemistry", "A+", 2);
        Course per3 = new Course("Moon", "Computer Science", "A+", 3);
        Course per4 = new Course( "Lunch", 4);
        Course per5 = new Course("Goetsche", "Math", "A+", 5);
        Course per6 = new Course("Young", "Trigonometry", "A+", 6);
        Course per7 = new Course("Sienna", "Calc", "A+", 7);
        Course per8 = new Course( "Recess", 8);

        Course[] scheduele = {per1, per2, per3, per4, per5, per6, per7, per8};

        Student st1 = new Student(name,scheduele);
        Student st2 = new Student(name);


        System.out.println(st1);
        System.out.println();
        System.out.println(st2);
    }
}
