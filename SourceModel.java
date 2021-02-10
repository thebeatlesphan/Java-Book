import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SourceModel
{

/*
reads a file containing a training corpus and builds a first-order Markov
chain of the transition probabilities between letters in the corpus.
Only alphabetic characters in the corpus should be considered and they should
be normalized to upper or lower case. For simplicity only consider the 26 English
alphabet.
*/

    private double[][] counts; 
    private double[] sum;
    private double[] sum1 = new double[26];
    private String source;

    public SourceModel(String sourceInput, String fileName)
    {
        counts = new double[26][26];
        sum = new double[26];
        source = sourceInput;

        System.out.print("Training " + source + " model ... ");
        
        //Read file by char
        FileReader inputStream = null;
        
        try
        {
            inputStream = new FileReader(fileName);
            int c;
            int p = 0;

            while ((c = inputStream.read()) != -1)
            {
                //if-statement for the 1st char
                if (p == 0) 
                {
                    if (c >= 65 && c <= 90)
                    {
                        c = c + 32;
                       //System.out.print((char)(c));
                        p = c;
                    }
                    else if (c >= 97 && c <= 122)
                    {
                        //System.out.println((char)c);
                        p = c;
                    }
                }
                else
                {
                    if (c >= 65 && c <= 90)
                    {
                        c = c + 32;
                        //System.out.print((char)(c));
                        counts[p - 97][c - 97]++; 
                        p = c;
                    }
                    else if (c >= 97 && c <= 122)
                    {
                        //System.out.print((char)c);
                        counts[p - 97][c - 97]++;
                        p = c;
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.exit(0);
        }
        System.out.println("done.");
    }

    //Divides the each index of the array by the sum of the row
    public void probability()
    {
        //calculates sum[]
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[i].length; j++) 
            {
                sum[i] = sum[i] + counts[i][j];
            }
        }
       
        //divides each index of counts[][] by the corresponding sum[]
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[i].length; j++)
            {
                counts[i][j] /= sum[i];
                counts[i][j] = Math.round(counts[i][j] * 100.0) / 100.0;
                if (counts[i][j] == 0.0)
                    counts[i][j] = 0.01;
            }
        }
    }

    //calculates the sum of the row
    public void sum()
    {
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[i].length; j++)
            {
                sum1[i] += counts[i][j];
            }
        }
    }

    //prints counts matrix && sum array
    public void display()
    {
        for (double[] i : counts)
        {
            for (double j : i)
            {
               //System.out.printf("%1.2f ", j);
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //prints sums[]
        System.out.println("There are " + sum.length + " sum rows");
        for (int i = 0; i < sum.length; i++)
        {
            System.out.println("sum of row " + i + " is " + (int)sum[i]);
        }

        //prints sum1[]
        System.out.println("sum1--------------");
        for (int i=0; i < sum1.length; i++)
        {
            System.out.println(sum1[i]);
        }
    }

    public String getName()
    {
        return source;
    }
    
    //ci + ci+1 * c1 + c2
    //Calculates probability that 'test' was generated by a source model
    public static double probabilityOfString(SourceModel source, String test)
    {
        double probability = 1.0;
        int a = 0;
        int b;
        test = test.toLowerCase();

        for (int i = 0; i < test.length(); i++)
        {
            if (a == 0)
            {
                if (test.charAt(i) >= 97 && test.charAt(i) <= 122)
                {
                    a = test.charAt(i);
                }
            }
            else
            {
                if (test.charAt(i) >=97 && test.charAt(i) <= 122)
                {
                    b = test.charAt(i); 
                    probability = probability * source.counts[b-97][a-97];

                    a = b;
                }
            }
        }
        return probability;
    }

    public String toString()
    {
        String dummy = "dummY";
        return dummy; 
    }

    public static void main(String[] args)
    {
        //split args[i] into String
        String[] splitArray = new String[args.length-1];

        for(int i=0; i<args.length-1; i++)
        {
            String[] fakeArray = new String[args.length-1];
            String split = args[i];
            fakeArray = split.split("[.]");

            for(int ii=0; ii<args.length-1; ii++)
            {
                splitArray[i] = fakeArray[0];
            }
        }

        //create new SourceModel objects
        SourceModel[] sourceArray = new SourceModel[args.length-1];
        for(int iii=0; iii<args.length-1; iii++)
        {
            sourceArray[iii] = new SourceModel(splitArray[iii],args[iii]);
        }

        //calculate probability matrix
        for (int i=0; i<args.length-1; i++)
        {
            sourceArray[i].probability();
        }

        sourceArray[0].sum();
        //test display
        sourceArray[0].display();

        //test test string
        System.out.println("last line");
        System.out.println(SourceModel.probabilityOfString(sourceArray[0],args[args.length-1]));
    }
}
