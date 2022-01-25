package Unit6_Arrays.CourseExample;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String RESET = "\u001b[37m";

    //Constructor where all fields are specified
    public Course(String teacherName, String subject, String currentGrade, int period){
        this.teacherName = teacherName;
        this.currentGrade = currentGrade;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    //Constructor for courses without a teacher or grade (lunch, study hall, early dismissal)
    public Course(String subject, int period){
        this.teacherName = "None";
        this.subject = subject;
        this.currentGrade = "None";
        this.period = period;
    }

    //Create a toString function that will print course data on one line
    public  String toString(){
        String output = "Period: " + this.period + " | " + this.subject + " | " + this.teacherName + " | ";
        if(this.currentGrade.equals("A") || this.currentGrade.equals("A-") || this.currentGrade.equals("A+")){
            output += GREEN + this.currentGrade + RESET;
        }
        else{
            output += RED + this.currentGrade + RESET;
        }
        return output;
    }

    //getters and setters
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

}
