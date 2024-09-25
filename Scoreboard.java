public class Scoreboard{
    public Scoreboard() {}
    public Scoreboard(String t1, String t2){
        team1 = t1;
        team2 = t2;
        activeTeam = team1;
    }

    private String team1;
    private String team2;

    private String activeTeam;
    private int team1Score;
    private int team2Score;

    public void recordPlay(int pointsScored){
        if ((activeTeam.equals(team1)) && (pointsScored != 0)){
            team1Score = team1Score + pointsScored;
        }
        else if ((activeTeam.equals(team2)) && (pointsScored != 0)){
            team2Score = team2Score + pointsScored;
        }
        else if ((activeTeam.equals(team2)) && (pointsScored == 0)){
            activeTeam = team1;
        }
        else if ((activeTeam.equals(team1)) && (pointsScored == 0)){
            activeTeam = team2;
        }
    }

    public String getScore(){
        return team1Score + "-" + team2Score + "-" + activeTeam;
    }
}
