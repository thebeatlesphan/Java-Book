public class Action extends Movie
{
    private int lateFee = 50;

    public Action()
    {
        super();
    }

    public Action(String MPAArating, String title, int ID)
    {
        super(MPAArating, title, ID);
    }

    public double calcLateFees(int Days)
    {
        return (lateFee * Days);
    }
}
