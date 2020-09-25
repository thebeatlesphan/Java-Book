import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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
    private int[] range; 
    private int[] count;
    private int maxBins; //chart.length
    private int size;
    private String path;
    private File dataFile; 

    public Histogram()
    {
        range = new int[1];
        count = new int[1];
        maxBins = 1;
    }

    public Histogram(String data)
    {
        path = data;
        dataFile = new File(path);
        range = new int[1];
        count = new int[1];
        maxBins = 1;
    }

    public Histogram(String data, int bins)
    {
        path = data;
        dataFile = new File(path);
        range = new int[bins];
        count = new int[bins];
        maxBins = bins;
        if (bins == 0)
        { 
            System.out.println("Error");
            System.exit(0);
        }
    }

    public Histogram (Histogram original)
    {
        range = original.range;
        maxBins = original.maxBins;
        path = original.path;
        dataFile = original.dataFile;
    }

    /**
     Sets maxBins.
     */
    public void setMaxBins(int bins)
    {
        maxBins = bins;
    }

    /**
     Initializes max values in the first array.
     */
    public void calcMax()
    {
         for  (int x = 1; x < range.length; x++)
            if (range[x] < 100)
            {
                range[x] = range[x - 1] + size;
            }
    }

    /**
     returns 100 / maxBins. Range of the bins. 
     */
    public int calcSize()
    {
        size = (int) Math.floor(100.0 / maxBins);
        return (int) Math.floor(100.0 / maxBins);
    }

    public Boolean getData()
    {
        return dataFile.exists();
    }

    public void toDisplay()
    {
        System.out.println();
        for(int x = 0; x < range.length; x++)
        {
            if (range.length - 1 - x  == 0)
                System.out.printf("%3d - %2d | %d %n",
                        range[range.length - 1 - x] + size,
                        range[range.length - 1 - x], count[x]);
            else if (x == range.length - 1)
            {
                System.out.println("HELLO");
                System.out.printf("%3d - %2d | %d %n",
            range[range.length - 1 - x] + (100 - range[range.length - 1 - x]),
                        range[range.length - 1 - x], count[x]);
            }
            else
                System.out.printf("%3d - %2d | %d %n",
                        range[range.length - 1 - x] + size,
                        range[range.length - 1 - x] + 1, count[x]);
        }
    }

    /**
     Reads the file and allocates marks for each bin
     */
    public void setCount()
    {
        Scanner read = null;
        try
        {
            read = new Scanner(dataFile);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
            System.exit(0);
        }
        
        for(int x = 0; x < range.length; x++)
        {
            while (read.hasNextInt())
            {
                if(read.nextInt() <= range[x] && read.nextInt() >= range[x])
                    count[x] = count[x] + 1;
                else
                    x++;
            }
        } 
    }

   /**
     Generates []
     */
    public String generate()
    {
       return ("[]");
    }

    public void getRange()
    {
        System.out.println("size: " + size);
        for (int x = 0; x < range.length; x++)
            System.out.println("range[" + x + "]: " + range[x]);
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Integer convert; // = Integer.parseInt(args[1]);
        Histogram test = new Histogram();

        if(args.length == 1)
        {
            System.out.println("How many bins would you like?");
            int input = keyboard.nextInt();
            test = new Histogram(args[0], input);
            test.calcSize();
            test.calcMax();
            test.setCount();
            test.toDisplay();

            test.getRange();
        }
        else if(args[1] != null)
        {
            convert = Integer.parseInt(args[1]);
            test = new Histogram(args[0], convert);
            test.calcSize();
            test.calcMax();
            test.setCount();
            test.toDisplay();

            test.getRange();
        }
        else
        {
            System.out.println("Error");
            System.exit(0);
        }
    }
}

