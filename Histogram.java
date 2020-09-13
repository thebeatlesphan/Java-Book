import java.util.Scanner;
import java.io.File;
//import Any Exception;

/**
    Takes two inputs (String dataFile, int numberOfBinsToCreate)
    datafile = csv = text file with data partition by commas and spaces / newlines
    scan the document once

    cmd-line arguments to inform program location of grade files - expected output

    bins
    1. bins may be specificed as additional cmd line e.g. java Histogram grades.csv 5
    2. if cmd-line arg is not present, the program must ask user for # of bins
 */
public class Histogram
{
    private int[][] range; 
    private static int maxBins = 0; //chart.length
    private String path;
    private File dataFile; 

    public Histogram()
    {
    }

    public Histogram(String data)
    {
        path = data;
        dataFile = new File(path);
    }

    Histogram(String data, int bins)
    {
        path = data;
        maxBins = bins;
        dataFile = new File(path);
        range = new int[maxBins][];
    }

    public Histogram(Histogram original)
    {
        range = original.range;
        maxBins = original.maxBins;
        path = original.path;
        dataFile = original.dataFile;
    }

    /**
     Sets maxBins.
     */
    public static void setMaxBins(int bins)
    {
        maxBins = bins;
    }

    /**
     Initializes max values in the first array.
     */
    public void calcMax()
    {
        int total = 100;
        range = new int[maxBins][2];
        range[0][0] = 100;
        for(int x=1; x < range.length; x++)
        {
            range[x][0] = total - scaleMax();
            total = total - scaleMax(); 
        }
    }

    /**
     Initializes min values in the second array. 
     */
    public void calcMin()
    {
        int total = 100;
        for(int x=0; x < range.length; x++)
        {
            range[x][1] = (total - scaleMax() + 1);
            range[maxBins-1][1] = 0;
            total = total - scaleMax();
        }
    }

    /**
     returns 100 / maxBins. Range of the bins. 
     */
    public int scaleMax()
    {
        return (int) Math.ceil(100.0 / maxBins);
    }
    
    public int scaleMin()
    {
        return (int) Math.floor(100.0 / maxBins);
    }

    public Boolean getData()
    {
        return dataFile.exists();
    }

    public int getLength()
    {
        return range.length;
    }

    public void toDisplay()
    {
        System.out.println();
        for(int x = 0; x < range.length; x++)
        {
            System.out.printf("%3d - %2d | %n",
                    range[x][0], range[x][1]);
        }
    }

    /**
     Reads the file and generates []
     */
    public void generate()
    {
        System.out.println(dataFile.exists());
    }


    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Histogram test = new Histogram();

        if (maxBins == 0)
        {
            System.out.println("How many bins would you like?");
            test.setMaxBins(keyboard.nextInt());
        }
        
        test.calcMax();
        test.calcMin();
        test.toDisplay();
        //this.getData();
    }
}

