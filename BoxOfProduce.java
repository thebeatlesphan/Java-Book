import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class BoxOfProduce
{
	private String food1, food2, food3;
	
	public BoxOfProduce()
	{
	}
	
	public BoxOfProduce(String newFood1, String newFood2, String newFood3)
	{
		setFood1(newFood1);
		setFood2(newFood2);
		setFood3(newFood3);
	}
	
	public void setFood1(String newFood)
	{
		food1 = newFood;
	}
	
	public String getFood1()
	{
		return food1;
	}
	
	public void setFood2(String newFood)
	{
		food2 = newFood;
	}
	
	public String getFood2()
	{
		return food2;
	}
	
	public void setFood3(String newFood)
	{
		food3 = newFood;
	}
	
	public String getFood3()
	{
		return food3;
	}
	
	public String toString()
	{
		return (food1 + "\n" + food2 + "\n" + food3);
	}
	
	public static void main(String[] args)
	{
		Scanner fileIn = null,
				fileIn2 = null,
				fileIn3 = null;
		try 
		{
			fileIn = new Scanner(new FileInputStream("DINGO.txt"));
			fileIn2 = new Scanner(new FileInputStream("DINGO.txt"));
			fileIn3 = new Scanner(new FileInputStream("DINGO.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error");
			System.exit(0);
		}
		
		
		BoxOfProduce box = new BoxOfProduce();
		
		Random random = new Random();
		int r = random.nextInt(4) + 1;
		int y = random.nextInt(4) + 1;
		int t = random.nextInt(4) + 1;
		
		for (int x = 0; r >= 0; r--)
		{
			box.setFood1(fileIn.nextLine());
		}
		System.out.println(box.getFood1());
		
		for (int x = 0; t >= 0; r--)
		{
			box.setFood2(fileIn2.nextLine());
		}
		System.out.println(box.getFood2());
		
		for (int x = 0; y >= 0; r--)
		{
			box.setFood3(fileIn3.nextLine());
		}
		System.out.println(box.getFood3());
		//System.out.println(box.toString());
		
		
		

	}
	
}