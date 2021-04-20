public class File extends Document
{
    private String pathname;

    public File()
    {
        super();
        pathname = "none";
    }

    public File(String newPath)
    {
        super();
        pathname = newPath;
    }

    public String getPath()
    {
        return pathname;
    }

    public void setPath(String newPath)
    {
        pathname = newPath;
    }

    public String toString()
    {
        return (pathname + "\n" +
                super.toString());
    }

    public static boolean ContainsKeyword(Document docObject, String keyword)
    {
        if (docObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        Document poop = new Document("dingo pan");
        Email poop2 = new Email("andy", "brian", "yolo");
        File poop3 = new File("master.file");

        ContainsKeyword(poop,"dingo");
        System.out.println(ContainsKeyword(poop,"dingo"));
    }
}
