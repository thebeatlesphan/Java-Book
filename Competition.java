public class Competition
{
    private String nameOfCompetition;
    private int year;
    private String winningTeam, runnerUp;

    //Contructors
    public Competition()
    {
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

    //mutators
    public Competition setNameComp(String newName)
    {
        return new Competition(newName);
    }

    public Competition setYear(int newYear)
    {
        return new Competition(newYear);
    }

    public Competition setTeams(String win,String run)
    {
        return new Competition(win, run);
    }

    //accesors
    public Competition getName()
    {
        return new Competition(nameOfCompetition);
    }
    
    public Competition getYear()
    {
        return new Competition(year);
    }

    public Competition getTeams()
    {
        return new Competition(winningTeam, runnerUp);
    }

    public String toString()
    {
        return (nameOfCompetition + "\n" + year + "\n" +
                "Winning Team\n" + winningTeam + "\n" +
                "Runner Up\n" + runnerUp);
    }
}
