public class Drama extends Movie
{
    private int lateFees = 6;

    public Drama()
    {
        super();
    }

    public Drama(String MPAArating, String title, int ID)
    {
        super (MPAArating, title, ID);
    }

    public double calcLateFees(int Days)
    {
        return (lateFees * Days);
    }
}
