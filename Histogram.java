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
    private int[][] range; 
    private int maxBins; //chart.length
    private String path;
    private File dataFile; 

    public Histogram()
    {
        range = new int[1][2];
        maxBins = 1;
    }

    public Histogram(String data)
    {
        path = data;
        dataFile = new File(path);
        range = new int[1][2];
        maxBins = 1;
    }

    public Histogram(String data, int bins)
    {
        path = data;
        dataFile = new File(path);
        range = new int[maxBins][2];
        if (bins == 0)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else 
        {
            maxBins = bins;
        }
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
    public void setMaxBins(int bins)
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
     Reads the file and allocates marks for each bin
     */
    public void count()
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
        
        for(int x = 0; x <= range.length; x++)
        {
            
        }
   }

    /**
     Generates []
     */
    public String generate()
    {
       return ("[]");
    }


    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Integer convert; // = Integer.parseInt(args[1]);
        Histogram test; // = new Histogram();

        if(args.length == 1)
        {
            System.out.println("How many bins would you like?");
            int input = keyboard.nextInt();
            test = new Histogram(args[0], input);
            test.calcMax();
            test.calcMin();
            test.toDisplay();
            test.generate();
       }
        else if(args[1] != null)
        {
            convert = Integer.parseInt(args[1]);
            test = new Histogram(args[0], convert);
            test.calcMax();
            test.calcMin();
            test.toDisplay();
            test.generate();
        }
        else
        {
            System.out.println("Error");
            System.exit(0);
        }
    }
}

