public class test
{
    public static void main(String[] args)
    {
        Movie movie = new Movie("G", "G Movie", 1);
        System.out.println(movie.calcLateFees(3));

        Action action = new Action("X", "X Movie", 2);
        System.out.println(action.calcLateFees(3));

        Comedy comedy = new Comedy("C", "C Movie", 3);
        System.out.println(comedy.calcLateFees(3));

        Drama drama = new Drama("D", "D Movie", 4);
        System.out.println(drama.calcLateFees(3));

        Rental testRental = new Rental("R", "R movie", 5, 15, 5);
        System.out.println(testRental.rentalFees());

        Rental[] rentalArray = new Rental[3];
        rentalArray[0] = new Rental("PG-13", "Nemo", 1, 300, 200);
        rentalArray[1] = new Rental("MA", "Shrek", 2, 300, 200);
        rentalArray[2] = new Rental(drama); 

        System.out.println(testRental.calcRentalFees(rentalArray));
    }
}
