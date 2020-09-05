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
    private int[] [] range; 
    private int maxBins; //chart.length
    private String path;
    private File dataFile; 

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
    }

    /**
     Range = 0 - 100
     Divisor will dictate number of bins
     each bin will be evenly divided
     */
    public void calcMax()
    {
        int total = 100; // 0 - 100 inclusive
        range[a] = total;
        int maxRange;
        for (int x = 1; x < range.length; x++)
        {
            range[x] = total - range; 
        }
    }

    public void toDisplay()
    {
        for (int bin = 1; bin <= maxBins; bin++)
            System.out.println("heheh");
    }

    public Boolean getData()
    {
        return dataFile.exists();
    }

    public int getLength()
    {
        return range.length;
    }

    public static void main(String[] args)
    {
        Histogram test = new Histogram("C:\\Users\\Dingo\\Documents\\Java-Book\\grades.csv",5);
        test.toDisplay();
        System.out.println(test.getData());
        System.out.println("escape tool: \"");
        System.out.println(test.getLength());
        
        //File testData = new File(grades.csv);
        //System.out.println(testData.exists());


    }
}
