import java.lang.Math;

public class Duelist
{
    private String name;
    private double accuracy;
    private boolean alive;
    int aaronWin, bobWin, charlieWin;  

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
    
    public int bob()
    {
        return bobWin;
    }

    public int charlie()
    {
        return charlieWin;
    }

    /*
    public static void fairGame()
    {
        //aaron > bob > charlie
        aaron.shootAtTarget(charlie);
        System.out.println("Aaron shoots are Charlie.  Charlie is alive? " + charlie.alive);
            if (charlie.alive == true)
            {
                charlie.shootAtTarget(bob);
                System.out.println("Charlie then shoots at Bob.  Bob is alive? " + bob.alive);
            }
            else
            {
                bob.shootAtTarget(aaron);
                System.out.println("Bob then shoots at Aaron. Aaron is alive? " + aaron.alive);
            }
    }
    */

    public static void main(String[] args)
    {
        Duelist aaron = new Duelist("Aaron", 0.33);
        Duelist bob = new Duelist("Bob", 0.50);
        Duelist charlie = new Duelist("Charlie", 1);
        
        System.out.println(bob.shootAtTarget(charlie));

        aaron.shootAtTarget(charlie);
        System.out.println("Aaron shoots are Charlie.  Charlie is alive? " + charlie.alive);
        if (charlie.alive == true)
        {
            charlie.shootAtTarget(bob);
            System.out.println("Charlie then shoots at Bob.  Bob is alive? " + bob.alive);
            
            System.out.println("Aaron shoots at Charlie again...");
            aaron.shootAtTarget(charlie);
            System.out.println("Is Charlie still alive? " + charlie.alive);
                if (charlie.alive == true)
                {
                    System.out.println("Charlie shoots at Aaron in the head.");
                    charlieWin++;
                }
                else 
                {
                    System.out.println("Aaron is the Puzzle champ!");
                    aaronWin++;
                }
        }
        else
        {
            bob.shootAtTarget(aaron);
            System.out.println("Bob then shoots at Aaron. Aaron is alive? " + aaron.alive);
                if (aaron.alive == true)
                {
                    System.out.println("A point for Bob");
                    bobWin++;
                }
                else
                {
                    System.out.println("Aaron got lucky this time");
                    aaronWin++;
                }
        }
        System.out.println(Duelist.aaron());
        System.out.println(Duelist.bob());
        System.out.println(Duelist.charlie());
    }
}
