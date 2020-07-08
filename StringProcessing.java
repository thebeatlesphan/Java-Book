public class StringProcessing
{
    public static final String LINE_CHANGE = ("I want to hate the butt off of you");
    public static void main(String[] args)
    {
        int findWord = LINE_CHANGE.indexOf("hate");
        String printSentence = LINE_CHANGE.substring(0, findWord);
        int findLast = LINE_CHANGE.indexOf("hate") + 4;

        System.out.println(printSentence + "love" + LINE_CHANGE.substring(findLast));
        System.out.println(LINE_CHANGE);
    }
}
