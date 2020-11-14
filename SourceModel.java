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
    private String source;

    public SourceModel(String source, String fileName)
    {
        counts = new double[26][26];
        sum = new double[26];
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

    public void probability()
    {
        for (double[] i : counts)
        {
            for (double j : i)
            {
            }
        }
    }

    public void display()
    {
        for (double[] i : counts)
        {
            for (double j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        SourceModel hello = new SourceModel("english", "english.corpus");
        
        System.out.println();
        hello.display();
    }
}
