public class Ogre_Alien extends AlienNEW
{
    private int damage = 0;

    public Ogre_Alien (int health, String name)
    {
        super (health, name);
    }

    public int getDamage()
    {
        damage +=6;
        return damage;
    }
}
