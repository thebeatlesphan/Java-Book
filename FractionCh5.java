public class FractionCh5
{
    private int numerator, denominator;
    
    public FractionCh5(int num, int den)
    {
        numerator = num;
        denominator = den;
    }

    public void setNum(int newNum)
    {
        numerator = newNum;
    }

    public void setDenom(int newDenom)
    {
        denominator = newDenom;
    }

    public void toDisplay()
    {
        System.out.println(numerator + "/" + denominator);
    }
    
    public FractionCh5 copy(FractionCh5 original)
    {
        return new FractionCh5(original.numerator, original.denominator);
    }

    /**
    Greatest Common Divisor (GCD: Euclidean Algorithm)
    let g = gcd(a,b)
    */
    private int gcd()
    {
        FractionCh5 copy = this.copy(this);

        while (copy.numerator != copy.denominator)
        {
           if (copy.numerator > copy.denominator)
               copy.numerator = copy.numerator - copy.denominator;
           else
               copy.denominator = copy.denominator - copy.numerator;
        }
        return copy.numerator;
    }

    public FractionCh5 reduced()
    {
        return new FractionCh5(numerator / gcd, denominator / gcd);
    }

    public boolean equals(FractionCh5 otherFraction)
    {
        return (this.numerator == otherFraction.numerator) && 
            (this.denominator == otherFraction.denominator);
    }

    public static void main(String[] args)
    {
        FractionCh5 object1 = new FractionCh5(15,75);
        
        System.out.println(object1.gcd());
        object1.toDisplay();

        object1.reduced().toDisplay();
        object1.toDisplay();
        
        FractionCh5 object2 = new FractionCh5(30, 151);

        System.out.println(object1.reduced().equals(object2.reduced()));
    }
}

