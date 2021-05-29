import java.util.Scanner;
import java.util.InputMismatchException;

public class test
{
    public static int getInt(Scanner keyboard) {
        boolean hello = false;
        int number = 0;

        while (!hello)
        {
            try
            {
                System.out.println("enter number");
                number = keyboard.nextInt();
                hello = true;
            }
            catch (InputMismatchException e)
            {
                keyboard.nextLine();
                System.out.println("you dummy");
            }
        }
        return number;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        boolean done = false;
        
        while (!done){
            try 
            {
                System.out.println("Enter a whole number");
                number = keyboard.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("Not a correctly written whole number.");
                System.out.println("try again");
            }
        }
    }
}
