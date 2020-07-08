public class TemperatureDemo
{
	public static void main(String[] args)
	{
		Temperature otherTemp = new Temperature(),
					otherTemp2 = new Temperature(-40, "F");
		
		otherTemp.setBoth(-40, "C");
		
		otherTemp.toString();
		
		System.out.println(otherTemp.equals(otherTemp2));
		System.out.println();
		
		System.out.println(otherTemp.getTemp());
		System.out.println(otherTemp.getScale());
		//System.out.println("1");
		System.out.println();
		System.out.println(otherTemp2.getTemp());
		System.out.println(otherTemp2.getScale());
		//System.out.println("2");
		System.out.println();
	}
}