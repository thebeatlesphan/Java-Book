import java.util.Arrays;

public class Diving
{
    //seven judges
    //1.2 - 3.8 difficulty * 0.6
    private static final int NUMBER_OF_JUDGES = 7;
    private static double judges[] = new double[NUMBER_OF_JUDGES];

    public static void scores()
    {
        for (int judge = 0; judge < NUMBER_OF_JUDGES; judge++)
        {
            judges[judge] = difficulty()*judgeScore();
            
        }
    }

    public static int difficulty()
    {
        return (int)(java.lang.Math.random()*(39-10)+10);
    }
    
    public static int judgeScore()
    {
        return (int)(java.lang.Math.random()*11);
    }

    public static void main(String[] args)
    {
        scores();
        System.out.println(Arrays.toString(judges));
        System.out.println(difficulty());
        System.out.println(judgeScore()*difficulty());
      
    }
}

