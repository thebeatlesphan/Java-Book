public class Test
{
    public static void main(String[] args)
    {
        Money andy = new Money(4, 20);
        System.out.println(andy);
        System.out.println("-------------------");

        System.out.println(andy.getCents());

        System.out.println(andy.equals(new Money(4,21)));

        Money dingo = new Money(2,10);

        System.out.println(Money.add(andy, dingo));
        System.out.println("-------------------");

       // System.out.println(andy.add(new Money(50,50)));

        andy.add(new Money(60, 60));
        System.out.println(andy);
    }
}
