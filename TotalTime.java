public class TotalTime
{
    public static void main(String[] args)
    {
        int totalSeconds = 50391;
        double hours = totalSeconds / 3600;
        double minutes = totalSeconds % 3600 / 60.0;
        double seconds = totalSeconds % 3600 % 60.0;

        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

        System.out.println("50,391 seconds equals\n"
        + (int)hours + (" hours\n")
        + (int)minutes + (" minutes and\n")
        + (int)seconds + (" seconds"));
    }
}
