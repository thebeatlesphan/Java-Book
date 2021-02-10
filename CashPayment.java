public class CashPayment extends Payment
{
    public CashPayment()
    {
        super();
    }

    public CashPayment(double setAmount)
    {
        super(setAmount);
    }

    public void paymentDetails()
    {
        System.out.println(getAmount() + " in cash was taken");
    }
}
