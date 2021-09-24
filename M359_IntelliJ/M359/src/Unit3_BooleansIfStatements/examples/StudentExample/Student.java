package Unit3_BooleansIfStatements.examples.StudentExample;

public class Student {
    String fName;
    String lName;
    int idNum;

    public Student(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public boolean equals(Student other){
        if(this.fName.equals(other.fName) && this.lName.equals(other.lName)){
            return true;
        } else{
            return false;
        }
    }

    public int compareTo(Student other){
        if((this.lName.compareTo(other.lName)) == 0){
            return this.fName.compareTo(other.fName);
        } else {
            return this.lName.compareTo(other.lName);
        }

    }
}
