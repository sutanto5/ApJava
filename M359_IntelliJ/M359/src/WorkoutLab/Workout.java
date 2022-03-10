package WorkoutLab;

public class Workout {
    private String name;
    private int workoutNum, duration;

    public Workout(String name, int workoutNum, int duration){
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Workout " + workoutNum + "\t\t" + name + "\t\t" + duration;
        return output;
    }

    /**
     * ca
     * @return
     */
    public int startExerscise(){
        System.out.println("Starting a Workout...");
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkoutNum() {
        return workoutNum;
    }

    public void setWorkoutNum(int workoutNum) {
        this.workoutNum = workoutNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
