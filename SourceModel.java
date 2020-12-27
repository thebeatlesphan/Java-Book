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

        System.out.println("Training " + source + " model ...");
        
        //Read file by char
        FileReader inputStream = null;
        
        try
        {
            inputStream = new FileReader(fileName);
            int c;
            int p = 0;

            while ((c = inputStream.read()) != -1)
            {
                if (p == 0) 
                {
                    if (c >= 65 && c <= 90)
                    {
                        c = c + 32;
                        System.out.print((char)(c));
                        p = c;
                    }
                    else if (c >= 97 && c <= 122)
                    {
                        System.out.println((char)c);
                        p = c;
                    }
                }
                else
                {
                    if (c >= 65 && c <= 90)
                    {
                        c = c + 32;
                        System.out.print((char)(c));
                        counts[p - 97][c - 97]++; 
                        p = c;
                    }
                    else if (c >= 97 && c <= 122)
                    {
                        System.out.print((char)c);
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

    public void display()
    {
        //prints counts[][]
        for (double[] i : counts)
        {
            for (double j : i)
            {
//                System.out.printf("%1.2f ", j);
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

    public void toDisplay()
    {
        System.out.println("Training " + source + " model ... done.");
        System.out.println(source + " ==> Model: " + source);

    }

    public static void main(String[] args)
    {
        SourceModel hello = new SourceModel("english", "english.corpus");
        
        System.out.println();
        hello.probability();
        hello.sum();
        hello.display();
        
    }
}
