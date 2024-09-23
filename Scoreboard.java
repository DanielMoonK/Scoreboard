public class Scoreboard{
    public Scoreboard() {}
    public Scoreboard(String t1, String t2){
        team1 = t1;
        team2 = t2;
    }

    private String team1;
    private String team2;

    private boolean teamOneReady = true;
    private int team1Score = 0;
    private int team2Score = 0;

    public void recordPlay(int pointsScored){
        if ((teamOneReady == true) && (pointsScored != 0)){
            team1Score = team1Score + pointsScored;
        }
        else if ((teamOneReady != true) && (pointsScored != 0)){
            team2Score = team2Score + pointsScored;
        }
        else if (pointsScored == 0){
            teamOneReady = !teamOneReady;
        }
    }

    public String getScore(){
        if (if teamOneReady == true){
            return (team1Score + "-" + team2Score + "-" + team1);
        }
    }
}