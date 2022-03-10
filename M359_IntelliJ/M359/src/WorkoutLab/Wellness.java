package WorkoutLab;

public class Wellness extends Workout{
    private int numStretches;

    public Wellness(String name, int workoutNum, int duration, int numStretches) {
        super(name, workoutNum, duration);
        this.numStretches = numStretches;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Workout " + super.getWorkoutNum() + "\t\t" + super.getName() + "\t" + super.getDuration();
        return output;
    }

    /**
     * calculates the amount of calories burned during the stretches
     * @return
     */
    public int startExerscise(){
        int calsPerStretch = (int)((Math.random() * 6) + 5);
        return numStretches * calsPerStretch;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }
}
