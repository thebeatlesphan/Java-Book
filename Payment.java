public class Payment
{
    private double amount;

    public Payment()
    {
        amount = 0;
    }
    
    public Payment(double setAmount)
    {
        amount = setAmount;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double newAmount)
    {
        amount = newAmount;
    }

    public void paymentDetails()
    {
        System.out.println(amount + " has been paid");
    }
}
