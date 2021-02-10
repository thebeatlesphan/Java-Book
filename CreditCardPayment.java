public class CreditCardPayment extends Payment
{
    private String name, expDate, ccNumber;

    public CreditCardPayment()
    {
        super();
        name = "NA";
        expDate = "01/21";
        ccNumber = "0000000000000000";
    }

    public CreditCardPayment(double newAmount, String newName, 
            String newEDate, String CC)
    {
        super(newAmount); 
        name = newName;
        expDate = newEDate;
        ccNumber = CC;
    }

    public String getName()
    {
        return name;
    }

    public void newName(String newInsert)
    {
        name = newInsert;
    }

    public String getExpDate()
    {
        return expDate;
    }

    public void newExpDate(String newDate)
    {
        expDate = newDate;
    }

    public String getCC()
    {
        return ccNumber;
    }

    public void newCC (String newNum)
    {
        ccNumber = newNum;
    }

    public void paymentDetails()
    {
        System.out.println(getAmount() + " amount paid by " + name + " which expires at "
                + expDate + " CC num = " + ccNumber);
    }
}
