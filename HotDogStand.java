public class HotDogStand
{
	private int id, numberSold;
    private static int totalSold;

    public HotDogStand()
    {
        id = 0;
        numberSold = 0;
    }

	public HotDogStand(int newID, int newSold)
	{
		id = newID;
		numberSold = newSold;
        totalSold = totalSold + newSold;
	}
	
	public void justSold()
	{
		numberSold++;
        totalSold++;
	}
	
    public int getID()
    {
        return id;
    }

    public int getNumberSold() //bad
	{
        return numberSold; 
	}
    
    public static int getTotalSold() //bad
    {
        return totalSold;
    }
    
    public static void main(String[] args)
    {
        HotDogStand stand1 = new HotDogStand(01, 99);
        HotDogStand stand2 = new HotDogStand(02, 54);
        HotDogStand stand3 = new HotDogStand(03, 21);

        stand1.justSold();

        System.out.println("YOUR GREAT HOTDOG DISPLAY!");
        System.out.println("--------------------------");
        System.out.printf("%-15s %15s %n", "Stand ID", "Hotdogs Sold");
        System.out.printf("%-15d %15d %n", stand1.getID(), stand1.getNumberSold());
        System.out.printf("%-15d %15d %n", stand2.getID(), stand2.getNumberSold());
        System.out.printf("%-15d %15d %n", stand3.getID(), stand3.getNumberSold());
        System.out.println("");
        System.out.println("The total number of hotdogs sold are: " + HotDogStand.getTotalSold());
        
    } 

}
