public class Email extends Document
{
    private String sender, recipient, title;

    public Email()
    {
        super();
    }

    public Email(String newSender, String newRec,
            String newTitle)
    {
        sender = newSender;
        recipient = newRec;
        title = newTitle;
    }

    public String getSender()
    {
        return sender;
    }

    public void setSender(String newSender)
    {
        sender = newSender;
    }

    public String newRecipient()
    {
        return recipient;
    }

    public void setRecipient(String newRecipient)
    {
        recipient = newRecipient;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public String toString()
    {
        return ("FROM: " + sender + "\n" +
                "TO: " + recipient + "\n" +
                "TITLE: " + title + "\n" +
                super.toString());
    }
}
