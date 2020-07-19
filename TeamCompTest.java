public class TeamCompTest
{
    public static void main(String[] args)
    {
        Team andy = new Team("HOME", "andy", "brian", "ryan", "dingo");
        Team calvin = new Team("AWAY", "calvin", "car", "optimus prime", "player4");
        System.out.println(andy);
        System.out.println(calvin);
        System.out.println();

        Competition comp1 = new Competition("valet", "HOME-string", "AWAY-string", 1971);
        Competition comp2 = new Competition("IT", "Away-string", "Home-string", 2020);
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println();

        andy.setComp(comp1, comp2);
        calvin.setComp(comp2, comp1);
        System.out.println(andy);
        System.out.println(calvin);


        System.out.println("-----------------------------------");
        andy.getComp1().setYear(1010);
        System.out.println(andy);
        System.out.println("-----------------------------------");
 
        andy.getComp2().setYear(0000);
        System.out.println(andy);
        System.out.println("------------------------------------");
        System.out.println(calvin);
    }
}
