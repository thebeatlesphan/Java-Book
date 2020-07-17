import java.lang.Math;

public class Duelist
{
    private String name;
    private double accuracy;
    private boolean alive;
    private int aaronWin, bobWin, charlieWin;  

    public Duelist(String newName, double newAccuracy) 
    {
        name = newName;
        accuracy = newAccuracy;
        alive = true;
    }

    public boolean shootAtTarget(Duelist target)
    {
        if (Math.random() < this.accuracy)
            return target.alive = false;
        else
            return target.alive = true;
    }

    public int aaron()
    {
        return aaronWin;
    }
    
    public void aaronWon()
    {
        aaronWin++;
    }

    public int bob()
    {
        return bobWin;
    }

    public void bobWon()
    {
        bobWin++;
    }

    public int charlie()
    {
        return charlieWin;
    }

    public void charlieWon()
    {
        charlieWin++;
    }

    public static void main(String[] args)
    {
        Duelist aaron = new Duelist("Aaron", 0.33);
        Duelist bob = new Duelist("Bob", 0.50);
        Duelist charlie = new Duelist("Charlie", 1);
        
        for (int x = 0; x <= 10000; x++)
        {
            aaron.shootAtTarget(charlie);
            if (charlie.alive == true)
            {
                charlie.shootAtTarget(bob);
                aaron.shootAtTarget(charlie);
                    if (charlie.alive == true)
                    {
                        charlie.charlieWon();
                    }
                    else 
                    {
                        aaron.aaronWon();
                    }
            }
            else
            {
                bob.shootAtTarget(aaron);
                    if (aaron.alive == true)
                    {
                        bob.bobWon();
                    }
                    else
                    {
                        aaron.aaronWon();
                    }
            }
        }
            System.out.println("IN THE END");
            System.out.println(aaron.aaron() + " / 10000 AARON");
            System.out.println(bob.bob() + " / 10000 BOB");
            System.out.println(charlie.charlie() + " / 10000 CHARLIE");
    }
}
