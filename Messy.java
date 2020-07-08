public class Messy {
	public static final double DISTANCE = 6.21;
	public static void main(String[] args)
	{
		double time = 35.5;
		double pace = time / DISTANCE;
		System.out.println("This program calculates your pace given a time and distance travled.");
		time = 35.5;
		System.out.println("Your pace is " + pace + " miles per hour.");
	}
}