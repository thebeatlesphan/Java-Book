public class RationalNumbers
{
    private int numerator, denominator;

    //constructors
    /**
    Displays the numerator & denominator
    @param no params
    @author Andy
    @version 1.1.1.1
    */
    public RationalNumbers()
    {
        numerator = 0;
        denominator = 1;
    }

    public RationalNumbers (int n)
    {
        numerator = n;
        denominator = 1;
    }

    public RationalNumbers(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    //copy constructor
    public RationalNumbers(RationalNumbers copy)
    {
        numerator = copy.numerator;
        denominator = copy.denominator;
    }

    //mutators
    public void setNumerator(int num)
    {
        numerator = num;
    }

    public void setDenominator(int den)
    {
        denominator = den;
    }

    //accessors
    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    //Greatest Common Denominator
    public int gcd()
    {
        RationalNumbers cat = new RationalNumbers(this.numerator, this.denominator);

        while (cat.denominator != 0)
            cat = new RationalNumbers(cat.denominator, cat.numerator%cat.denominator);
        return cat.numerator;
    }

    //methods
    public void add(RationalNumbers f2)
    {
        this.numerator = (this.numerator * f2.denominator) +
                        (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator; 
    }

    public void subtract(RationalNumbers f2)
    {
        this.numerator = (this.numerator * f2.denominator) -
                        (f2.numerator * this.denominator);
        this.denominator = this.denominator * f2.denominator; 
    }

    public void multiply(RationalNumbers f2)
    {
        this.numerator = this.numerator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
    }

    public void divide(RationalNumbers f2)
    {
        this.numerator = this.numerator * f2.denominator;
        this.denominator = this.denominator * f2.numerator;
    }

    //equals
    public boolean equals(RationalNumbers dummy)
    {
        return (this.numerator * dummy.denominator == 
                this.denominator * dummy.numerator);
    }

    //normalize
    public void normalize()
    {
        if(denominator < 0)
        {
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
        else
            numerator = numerator * -1;
    }

    //toString
    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args)
    {
        RationalNumbers test = new RationalNumbers(38,30);

        System.out.println(test.gcd());
    }

}
