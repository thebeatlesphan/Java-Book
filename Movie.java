public class Movie
{
    private String MPAArating, title;
    private int ID;
    private int lateFee = 2;
   
    public Movie()
    {
        MPAArating = null;
        title = null;
        ID = 0;
    }

    public Movie(String MPAArating, String title, int ID)
    {
        MPAArating = this.MPAArating;
        title = this.title;
        ID = this.ID;
    }

    public String getMPAArating()
    {
        return MPAArating;
    }

    public String getTitle()
    {
        return title;
    }

    public int getID()
    {
        return ID;
    }

    public void setMPAArating(String newRating)
    {
        MPAArating = newRating;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public void setID(int newID)
    {
        ID = newID;
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (this.getClass() != otherObject.getClass())
            return false;
        else
        {
            Movie otherMovie = (Movie)otherObject;
            return (this.ID == otherMovie.ID);
        }
    }

    public double calcLateFees(int Days)
    {
        return (lateFee * Days);
    }
 }
