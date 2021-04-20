public class Comedy extends Movie
{
    private double lateFees = 2.5;

    public Comedy()
    {
        super();
    }

    public Comedy(String MPAArating, String title, int ID)
    {
        super(MPAArating, title, ID);
    }

    public double calcLateFees(int Days)
    {
        return (lateFees * Days);
    }
}
