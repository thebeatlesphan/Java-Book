public class Team
{
    private String name1, name2, name3, name4;
    private String teamName;
    private Competition competition1, competition2;
   
    //contructors
    public Team()
    {
    }

    public Team(String team, 
           String pers1, String pers2,
           String pers3, String pers4,
           Competition comp1,
           Competition comp2)
    {
        teamName = team;
        name1 = pers1;
        name2 = pers2;
        name3 = pers3;
        name4 = pers4;
    }

    public Team(String team, String name1, String name2, String name3, String name4)
    {
        this.teamName = team;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
    
    public Team(String name1, String name2, String name3, String name4)
    {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }


    public Team(String name)
    {
       teamName = name;
    }

    public Team(Competition comp1, Competition comp2)
    {
        competition1 = comp1;
        competition2 = comp2;
    }

    //mutators
    public Team setTeamName(String name)
    {
        return new Team(name);
    }

    public Team setMemberNames(String name1, String name2,
        String name3, String name4)
    {
       return new Team(name1, name2, name3, name4);
    }

    public Team setComp(Competition comp1, Competition comp2)
    {
        return new Team(comp1, comp2);
    }

    //accesors
    public Team getTeamName()
    {
        return new Team(teamName);
    }

    public Team getMembers()
    {
        return new Team(name1, name2, name3, name4);
    }

    public Team getComp()
    {
        return new Team(competition1, competition2);
    }

    public String display()
    {
        return "Hello" + this.getTeamName();
    }
    
    public String toString()
    {
        return (teamName + "\n" + name1 + "\n" +  competition1);
    }

}
