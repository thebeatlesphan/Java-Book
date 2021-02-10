public class Marshmellow_Man_Alien extends AlienNEW
{
    private int damage = 0;

    public Marshmellow_Man_Alien(int health, String name)
    {
        super(health, name);
    }

    public int getDamage()
    {
        damage +=1;
        return damage;
    }

    public static void main(String[] args)
    {
        Snake_Alien snake = new Snake_Alien(5, "andy");
        snake.getDamage();
        snake.getDamage();
        System.out.println(snake.getDamage());
    }
}
