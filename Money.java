public class Money
{
    private int dollars, cents;

    //Constructors
    public Money()
    {
        dollars = 0;
        cents = 0;
    }

    public Money(int newDollars, int newCents)
    {
        dollars = newDollars;
        cents = newCents;
    }

    public Money(int newDollars)
    {
        dollars = newDollars;
        cents = 0;
    }

    //Mutators
    public void setDollars(int bills)
    {
        dollars = bills;
    }

    public void setCents(int coins)
    {
        cents = coins;
    }

    //accessors
    public int getDollars()
    {
        return dollars;
    }

    public int getCents()
    {
       return cents;
    } 
    
    public Money(Money monies)
    {
    }

    //equals
    public boolean equals(Money left)
    {
        if(this.dollars == left.dollars && this.cents == left.cents)
            return true;
        else
            return false;
    }

    //toString
    public String toString()
    {
        return "You have " + dollars + " dollars and " + cents + " cents!";
    }

    //methods
    public static Money add(Money m1, Money m2)
    {
        return new Money(m1.dollars + m2.dollars, m1.cents + m2.cents);
    }

    public static Money subtract(Money m1, Money m2)
    {
        return new Money(m1.dollars - m2.dollars, m1.cents - m2.cents);
    }
/*
    public Money add(Money m2)
    {
        return new Money(this.dollars + m2.dollars, this.cents + m2.cents);
    }

    public Money subtract(Money m2)
    {
        return new Money(this.dollars - m2.dollars, this.cents - m2.cents);
    }
*/

    public void add(Money m2)
    {
        this.dollars = this.dollars + m2.dollars;
        this.cents = this.cents + m2.cents;
    }

    public void substract(Money m2)
    {
        this.dollars = this.dollars - m2.dollars;
        this.cents = this.cents - m2.cents;
    }
}
