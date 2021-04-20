public class Snake_Alien extends AlienNEW
{
    private int damage = 0;

    public Snake_Alien(int health, String name)
    {
        super(health, name);
    }

    public int getDamage()
    {
        damage +=10;
        return damage;
    }
}
