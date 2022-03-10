package Unit9_Inheritance;

public class Athlete {
    private String name;
    private int age;

    public Athlete(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String diffName){
        name = diffName;
    }

    public void setAge(int newAge){
        age = newAge;
    }
}
