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
        competition1 = new Competition(comp1);
        competition2 = new Competition(comp2);
    }

    //Copy Constructor
    public Team(Team thi)
    {
        teamName = thi.teamName;
        name1 = thi.name1;
        name2 = thi.name2;
        name3 = thi.name3;
        name4 = thi.name4;
    }

    //mutators
    public void setTeamName(String name)
    {
        teamName = name;
    }

    public void setMemberNames(String name1, String name2,
        String name3, String name4)
    {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }

    public void setComp(Competition comp1, Competition comp2)
    {
        competition1 = new Competition(comp1);
        competition2 = new Competition(comp2);
    }

    //accessors
    public String getTeamName()
    {
        return teamName;
    }

    public String getMember1()
    {
        return name1;
    }

    public String getMember2()
    {
        return name2;
    }

    public String getMember3()
    {
        return name3;
    }

    public String getMember4()
    {
        return name4;
    }

    public Competition getComp1()
    {
     //   return new Competition(competition1); 
        return competition1;
    }

    public Competition getComp2()
    {
        return competition2; 
    }

    public String display()
    {
        return "Hello " + this.getTeamName();
    }
    
    public String toString()
    {
        return ("Teamname: " + teamName + "\n" + 
                "Leader: " + name1 + "\n" +  
                "Comp1: " + competition1 + 
                "Comp2: " + competition2);
    }

}
