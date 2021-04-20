public class Rental extends Movie
{
    private int customerID, lateDays;
    private Movie someMovie;

    public Rental()
    {
        someMovie = null;
        customerID = 0;
        lateDays = 0;
    }

    public Rental(Movie otherMovie, int customerID, int lateDays)
    {
        this.someMovie = otherMovie;
        this.customerID = customerID;
        this.lateDays = lateDays;
    }

    public Rental(String MPAArating, String title, int ID,
            int customerID, int lateDays)
    {
        super(MPAArating, title, ID);
        this.customerID = customerID;
        this.lateDays = lateDays;
    }

    public double rentalFees()
    {
        return (someMovie.calcLateFees(this.lateDays));
    }

    public static double lateFeesOwed(Rental[] someRental)
    {
        double total = 0;
        for (Rental a : someRental)
        {
            total += a.rentalFees();
        }
        return total;
    }

    public static void main(String[] args)
    {
        Rental[] testArray = new Rental[3];

        testArray[0] = new Rental((new Action("A", "A Movie", 1)), 100, 3); 
        testArray[1] = new Rental((new Comedy("C", "C Movie", 2)), 100, 5); 
        testArray[2] = new Rental((new Drama("D", "D Movie", 3)), 100, 39); 

        System.out.println(Rental.lateFeesOwed(testArray));
    }
}
