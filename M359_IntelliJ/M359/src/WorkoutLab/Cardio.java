package WorkoutLab;

public class Cardio extends Workout{
    //need to fix
    private double speed;
    private double distance;

    public Cardio(String name, int workoutNum, int duration, double speed) {
        super(name, workoutNum, duration);
        this.speed = speed;
        this.distance = speed * ((double) duration/60);

    }

/*
    public String toString() {
        String output = "";
        output += "Workout " + super.getWorkoutNum() + "\t\t" + super.getName() + "\t\t" + super.getDuration();
        return output;
    }
*/
    @Override
    /**
     * calculates the amount of calories burned during the calorie workout
     */
    public int startExerscise(){
        int calBurned = (int)((Math.random() * 61) + 80);
        calBurned *= distance;
        return calBurned;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
