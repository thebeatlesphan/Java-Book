/**
Class for a sale of one item with discount expressed as a percent of
the price, but no other adjustments.
Class invariant: The price is always nonegative; the name is a 
nonempty string; the discount is always nonnegative.
*/

public class DiscountSale extends Sale
{
    private double discount; //A percent of the price. Cannot be negative.

    public DiscountSale()
    {
        super();
        discount = 0;
    }

    /**
    Precondition: theName is a nonempty string; thePrice is nonegative;
    theDiscount is expressed as a percent of the price and is nonegative.
    */
    public DiscountSale(String theName, double thePrice,
            double theDiscount)
    {
        super (theName, thePrice);
        setDiscount (theDiscount);
    }

    public DiscountSale (DiscountSale originalObject)
    {
        super (originalObject);
        discount = originalObject.discount;
    }

    public static void announcement()
    {
        System.out.println("This is the DiscountSale class.");
    }

    public double bill()
    {
        double fraction = discount/100;
        return (1 - fraction)*getPrice();
    }

    public double getDiscount()
    {
        return discount;
    }

    /**
    Precondition: Discount is nonegative.
    */
    public void setDiscount(double newDiscount)
    {
        if (newDiscount >= 0)
            discount = newDiscount;
        else
        {
            System.out.println("Error: negative discount.");
            System.exit(0);
        }
    }

    public String toString()
    {
        return (getName() + " Price = %" + getPrice() +
                " Discount = " + discount + "%\n" +
                " Total cost = $" + bill());
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass() != otherObject.getClass())
            return false;
        else
        {
            DiscountSale otherDiscountSale = 
                (DiscountSale)otherObject;
            return (super.equals(otherDiscountSale) &&
                    discount == otherDiscountSale.discount);
        }
    }
}
