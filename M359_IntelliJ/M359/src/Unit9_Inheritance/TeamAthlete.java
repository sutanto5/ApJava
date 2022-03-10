package Unit9_Inheritance;

public class TeamAthlete extends Athlete{
    private String teamName;
    private String sport;

    public TeamAthlete(String name, int age, String teamName, String sport) {
        super(name, age);
        this.sport = sport;
        this.teamName = teamName;
    }

    public String getTeamName(){
        return getTeamName();
    }

    public String getSport(){
        return getSport();
    }

    public void setTeamName(String newName){
        teamName = newName;
    }

    public void setSport(String diffSport){
        sport = diffSport;
    }
}
