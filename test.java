import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class test
{
    public static void main(String[] args)
    {
        double number = 0.12345;

        System.out.println(number);

        double trust = Math.round(number * 1000000.0);
        System.out.println(trust);
    }
}

