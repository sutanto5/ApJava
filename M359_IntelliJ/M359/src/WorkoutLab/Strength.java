package WorkoutLab;

public class Strength extends Workout{
    private int weight;

    public Strength(String name, int workoutNum, int duration, int weight){
        super(name, workoutNum, duration);
        this.weight = weight;
    }

  /*
    public String toString() {
        String output = "";
        output += "Workout " + super.getWorkoutNum() + "\t\t" + super.getName() + "\t\t" + super.getDuration();
        return output;
    }
*/
    @Override
    public int startExerscise(){
        int multipier = (int)((Math.random() * 3) + 1);
        return multipier * weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
