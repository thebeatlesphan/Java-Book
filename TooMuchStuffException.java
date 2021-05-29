public class TooMuchStuffException extends Exception
{
    public TooMuchStuffException()
    {
        super("Too much stuff!");
    }

    public TooMuchStuffException(String message)
    {
        super(message);
    }
}

