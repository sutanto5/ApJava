package Unit3_BooleansIfStatements.examples.StudentExample;

import Unit3_BooleansIfStatements.examples.StudentExample.Student;

public class StudentTester {

    //DONT FORGET PSVM
    public static void main(String[] args) {

        //Instances
        Student stu = new Student("Engurren", "Preteseille", 113);
        Student stu2 = new Student("joshua", "Sutanto", 123);
        Student stu3 = new Student("Engurren", "Preteseille", 113);
        Student stu4 = new Student("Kuldeep", "Debnath", 444);

        //equals
        System.out.println(stu.equals(stu2));
        System.out.println(stu.equals(stu3));

        //compare to
        System.out.println(stu.compareTo(stu2));
        System.out.println(stu.compareTo(stu3));
        System.out.println(stu2.compareTo(stu3));

    }
}
