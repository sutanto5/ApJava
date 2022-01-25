package Unit6_Arrays.CourseExample;

public class Student {
    private String name;
    private int grade;
    private Course[] myClasses;

    public Student(String name){
        this.name = name;
        myClasses = new Course[8]; //8 period day with empty periods
    }

    public Student(String name, Course[] myClasses){
        this.name =name;
        this.myClasses = myClasses;     //Accepts a fully set up scheduele
    }

    //write a toString method that will print:
    //  1. A student's name
    //  2. Use a for-loop to print all of the course objects
    public String toString(){
        String desc = "Name: " + name + "\n";

        if(myClasses[0] == null){
            desc += "\n " + name + "has no classes";
        }
        else {
            for(int i = 0; i< this.myClasses.length; i++) {
                desc += " \n" + this.myClasses[i];
            }
        }
        return desc;
    }
}
