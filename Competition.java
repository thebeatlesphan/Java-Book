public class Competition
{
    private String nameOfCompetition;
    private int year;
    private String winningTeam, runnerUp;

    //Contructors
    public Competition()
    {
        nameOfCompetition = null;
        
    }

    public Competition(String name, String winteam, String runteam, int newYear)
    {
        nameOfCompetition = name;
        winningTeam = winteam;
        runnerUp = runteam;
        year = newYear;
    }

    public Competition(String name)
    {
        nameOfCompetition = name;
    }

    public Competition(String win,String run)
    {
        winningTeam = win;
        runnerUp = run;
    }

    public Competition(int newYear)
    {
        year = newYear;
    }

    //Copy Constructor
    public Competition(Competition comp)
    {
        nameOfCompetition = comp.nameOfCompetition;
        year = comp.year;
        winningTeam = comp.winningTeam;
        runnerUp = comp.runnerUp;
    }

    //mutators
    public void setNameComp(String newName)
    {
        nameOfCompetition = newName; 
    }

    public void setYear(int newYear)
    {
        year = newYear;
    }

    public void setTeams(String win,String run)
    {
        winningTeam = win;
        runnerUp = run;
    }

    //accessors
    public String getName()
    {
        return nameOfCompetition;
    }
    
    public int getYear()
    {
        return year; 
    }

    public String getWinTeam()
    {
        return winningTeam; 
    }

    public String getRun()
    {
        return runnerUp;
    }

    public String toString()
    {
        return ("Name: " + nameOfCompetition + "\n" +
                "Year: " + year + "\n" +
                "Winning Team: " + winningTeam + "\n" +
                "Runner Up: " + runnerUp);
    }
}
