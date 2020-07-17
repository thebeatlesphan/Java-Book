public class TeamCompTest
{
    public static void main(String[] args)
    {
        Team andy = new Team("Andy's Team", "andy", "mo", "mike", "nan");
        Team mish = new Team("Mish's Team", "mish", "emman", "adam", "sohaib");

        System.out.println(andy);
        System.out.println(mish);
        System.out.println();

        Competition support = new Competition("Support", "andy", "mish", 2012);
        Competition imp = new Competition("Imp", "mish", "andy", 2011);

        System.out.println(support);
        System.out.println(imp);
        System.out.println();

        andy.setComp(support, imp);
        mish.setComp(support, imp);


        System.out.println(andy.display());
        System.out.println();

        andy.toString();

        System.out.println(support.getTeams());
        
        Team testTeam = new Team("bob");
        System.out.println(testTeam);
        System.out.println();

        System.out.println(andy);
    }
}
