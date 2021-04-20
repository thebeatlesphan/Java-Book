public abstract class AlienNEW
{
    private int health;//0=dead, 100=full strength
    public String name;

    public AlienNEW(int health, String name)
    {
        this.health = health;
        this.name = name;
    }

    public abstract int getDamage();
}
